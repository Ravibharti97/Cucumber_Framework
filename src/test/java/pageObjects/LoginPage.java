package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.Common_Operations;

public class LoginPage {
	
	  WebDriver driver ;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	Common_Operations common =new Common_Operations();

	private By inputEmail = By.id("input-email");
	private By inputPassword= By.id("input-password");
	private By  loginBtn=By.xpath("//input[@value='Login']");
	private By acountBtn=By.xpath("//span[text()='My Account']");
	private By listBtns= By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a");
	private By warning = By.xpath("//div[@class='alert alert-danger alert-dismissible']/i");

	
	private By home=By.xpath("//i[@class='fa fa-home']");
//	private By homeIcon=By.className("fa fa-home");
	private By laptoptext= By.xpath("//div[@class='caption']/h4/a[text()='MacBook']");
	private By addtocart = By.xpath("//button[text()='Add to Cart']");
	private By addMessge= By.xpath("//div[@class='alert alert-success alert-dismissible']");
	private By checkoutBtn = By.xpath("//*[text()=' Checkout']");
	 
	
	public void setUserName(String username) {
		
		
		WebElement email =common.findElement(driver, inputEmail);
		email.clear();
		common.sendValue(email, username);
	}
	
	public void setPassword(String password) {
		
		WebElement inputPass=common.findElement(driver, inputPassword);
		inputPass.clear();
		common.sendValue(inputPass, password);
	}
	public void clickLoginBtn()
	{
		WebElement login = common.findElement(driver, loginBtn);
		common.clickElement(login);
	}
	
	public String loginTitle() {
		return driver.getTitle();
	}
	public void clickLogout() throws InterruptedException {
		
		
		WebElement account = common.findElement(driver, acountBtn);
		common.clickElement(account);
		Thread.sleep(2000);
		
	common.selectDropdownlist(driver, listBtns, "Logout");
	Thread.sleep(3000);

	}	
	
	public String logoutTitle() {
		return driver.getTitle();
	}

	
//	 items Page methods 
	
	public void clickHomeIcon() {
		WebElement homee= common.findElement(driver, home);
		common.clickElement(homee);
	}
	public String itemPageTitle() {
		return driver.getTitle();
	}
	public void clickCard() throws InterruptedException {
		
		WebElement card= common.findElement(driver, laptoptext);
		common.scrollIntoView(driver, card);
		Thread.sleep(5000);
		common.clickElement(card);
	
	}
	public String getItemPagetitle() {
		return driver.getTitle();
				
	}
	
public  void addItem() {
	WebElement addBtn= common.findElement(driver, addtocart);
	common.clickElement(addBtn);
}

public Boolean value() {
//	String value=common.findElement(driver, addMessge).getText();
	return common.findElement(driver, addMessge).isDisplayed();
}

public void clickcheckout() {
	WebElement checkout = common.findElement(driver, checkoutBtn);
	common.clickElement(checkout);	
}

	
	
	
}
