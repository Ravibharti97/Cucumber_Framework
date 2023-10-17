package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Items_page;

public class Items_steps {
	
// private WebDriver driver;
// private Items_page items;
//	
// 
//
// @Before
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
////		items= new Items_page(driver);
//	}
// 
// @After 
// public void tearDown()
// {
//	 driver.quit();
// }
// 
// 
// @Given("user on the login page")
// public void user_on_the_login_page() {
//		items= new Items_page(driver);
//    
// }
//
// @When("user opens the URL {string}")
// public void user_opens_the_url(String url) { 
//	 driver.get(url);
//     
// }
//
// @And("user enters Email as {string} and Password as {string}")
// public void user_enters_email_as_and_password_as(String username, String password) {
//	 items.setUserName(username);
//		items.setPassword(password);
//
//     
// }
//
// @And("clicks on Login")
// public void clicks_on_login() throws InterruptedException {
//	 items.clickLoginBtn();
//
//
//     
// }
//
// @Then("page title should be {string}") 
// public void page_title_should_be(String title) throws InterruptedException {
//	 Thread.sleep(2000);
//	 System.out.println(items.getloginTitle());
//	 Thread.sleep(3000);
//	 Assert.assertEquals(items.getloginTitle(), title);
//
//	 
//	 
// }
// 
// 
// 
// @Then("clicks on the home icon")
// public void clicks_on_the_home_icon() {
//	 items.clickHomeIcon();	
//   
// }
//
// @Then("user navigates to the home page {string}")
// public void user_navigates_to_the_home_page(String title2) {
//	 Assert.assertEquals(items.itemPageTitle(), title2);
//     
// }
//
// @Then("clicks on the Cart")
// public void clicks_on_the_cart() throws InterruptedException {
//	 items.clickCard();
//   
// }
//
// @And("clicks on the AddtoCart button")
// public void clicks_on_the_addto_cart_button() {
//	 items.addItem();
//
//    
// }
//
// @Then("the User should see a success message indicating {string}")
// public void the_user_should_see_a_success_message_indicating(String value) {
//	 Assert.assertEquals(items.value(), "Success: You have added");
//    
// }

}
