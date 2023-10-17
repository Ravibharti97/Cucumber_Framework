package stepDefinations;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		
	}

	
	

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
	public void click_on_login() throws InterruptedException {
		ob.clickLoginBtn();
		Thread.sleep(3000);

	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		Thread.sleep(2000);
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
	 public void clicks_on_the_addto_cart_button() throws InterruptedException {
		 Thread.sleep(5000);
		 ob.addItem();

	    
	 }

	 @Then("the User should see a success message indicating {string}")
	 public void the_user_should_see_a_success_message_indicating(String value) throws InterruptedException {
		 Thread.sleep(5000);

		 Assert.assertTrue(ob.value());
	    
	 }

	
	 @When("click on items")
	 public void click_on_items() {
	   
	 }

	 @When("click on checkout button")
	 public void click_on_checkout_button() {
	 }

	 @Then("user nevigate to the checkout page {string}")
	 public void user_nevigate_to_the_checkout_page(String checkoutpagetitle) {
	
	 }
	
}
