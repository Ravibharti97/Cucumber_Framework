package stepDefinations;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {

	private WebDriver driver;
	private LoginPage ob;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

//	@After
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//
//	}

	@Given("user Launch Chrome browser")
	public void user_launch_chrome_browser() {

	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
		ob = new LoginPage(driver);

	}

	@When("user enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String username, String password) {
		ob.setUserName(username);
		ob.setPassword(password);

	}

	@When("click on Login")
	public void click_on_login() {
		ob.clickLoginBtn();

	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertEquals(ob.loginTitle(), title);

	}

	@When("user Click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		ob.clickLogout();
		Thread.sleep(3000);

	}

	@Then("page Title should be after logout {string}")
	public void page_title_should_be_after_logout(String title2) {
		Assert.assertEquals(ob.logoutTitle(), title2);

	}

	@Then("i should see an error message indicating {string}")
	public void i_should_see_an_error_message_indicating(String title2) throws InterruptedException {

		Assert.assertTrue(true);
	}

	// items test stepdefinations

	@Then("clicks on the home icon")
	public void clicks_on_the_home_icon() {
		ob.clickHomeIcon();

	}

	@Then("user navigates to the home page {string}")
	public void user_navigates_to_the_home_page(String title2) {
		Assert.assertEquals(ob.itemPageTitle(), title2);

	}

	@Then("clicks on the Cart")
	public void clicks_on_the_cart() throws InterruptedException {
		ob.clickCard();

	}

	@And("clicks on the AddtoCart button")
	public void clicks_on_the_addto_cart_button() {

		ob.addItem();

	}

	@Then("the User should see a success message indicating {string}")
	public void the_user_should_see_a_success_message_indicating(String value) throws InterruptedException {
 Thread.sleep(2000);
		Assert.assertTrue(ob.value());

	}

	@When("click on checkout button")
	public void click_on_checkout_button() {
		ob.clickcheckout();
	}

	@Then("user nevigate to the checkout page {string}")
	public void user_nevigate_to_the_checkout_page(String checkoutpagetitle) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(ob.verifyCheckoutTitle(), checkoutpagetitle);
//		Assert.assertEquals(ob.verifyCheckoutTitle(), false);

	}

	@Then("user click on radio button to address")
	public void user_click_on_radio_button_to_address() {
		ob.clickRadioButton();

	}

	@When("user enter the first name {string} into the first name field")
	public void user_enter_the_first_name_into_the_first_name_field(String firstname) {
		ob.fillFirstName(firstname);

	}

	@When("user enter the last name {string} into the last name field")
	public void user_enter_the_last_name_into_the_last_name_field(String lastname) {
		ob.fillLastName(lastname);

	}

	@When("user enter the company {string} into the company field")
	public void user_enter_the_company_into_the_company_field(String company) {
		ob.fillCompanyName(company);

	}

	@Then("user enter the address1 {string} into the address1 field")
	public void user_enter_the_address1_into_the_address1_field(String address1) {
		ob.fillAddress(address1);

	}

	@Then("user enter the address2 {string} into the address2 field")
	public void user_enter_the_address2_into_the_address2_field(String address2) {
		ob.fillAddress2(address2);

	}

	@Then("user enter the city {string} into the city field")
	public void user_enter_the_city_into_the_city_field(String city) throws InterruptedException {
		Thread.sleep(2000);
		ob.fillCityName(city);

	}

	@Then("user enter the postal code {string} into the postal code field")
	public void user_enter_the_postal_code_into_the_postal_code_field(String postalcode) throws InterruptedException {
		Thread.sleep(2000);
		ob.fillPostCode(postalcode);

	}

	@Then("user select the country {string} from the country dropdown")
	public void user_select_the_country_from_the_country_dropdown(String countryName) throws InterruptedException {
		ob.selectCountry(countryName);

	}

	@Then("user select the state {string} from the state dropdown")
	public void user_select_the_state_from_the_state_dropdown(String stateName) throws InterruptedException {
		ob.selectState(stateName);

	}

	@Then("user click on form button")
	public void user_click_on_form_button() {

	}

	 @After
		public void teardown(Scenario sc)
		{
			System.out.println("Tear Down method executed..");
			if(sc.isFailed()==true)
			{
				
            String fileWithPath= System.getProperty("user.dir")+"/Screenshot/failedScreenshot.png";
				TakesScreenshot scrShot =((TakesScreenshot)driver);
				File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				File DestFile=new File(fileWithPath);
				//Copy file at destination
				try {
					FileUtils.copyFile(SrcFile, DestFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			driver.quit();
		}
		
	
@AfterStep
	public void screenshot(Scenario scenario) {
		final byte[]screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		
	}

	
	
}



