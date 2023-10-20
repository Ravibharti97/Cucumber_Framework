package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilites.Common_Operations;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By inputEmail = By.id("input-email");
	private By inputPassword = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By acountBtn = By.xpath("//span[text()='My Account']");
	private By listBtns = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a");
	private By warning = By.xpath("//div[@class='alert alert-danger alert-dismissible']/i");

	private By home = By.xpath("//i[@class='fa fa-home']");
//	private By homeIcon=By.className("fa fa-home");
	private By laptoptext = By.xpath("//div[@class='caption']/h4/a[text()='MacBook']");
	private By addtocart = By.xpath("//button[text()='Add to Cart']");
	private By addMessge = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	private By checkoutBtn = By.xpath("//a[@title='Checkout']");
	private By newaddBtn = By.xpath("//input[@value='new']");
	private By firstNameInput = By.xpath("//input[@id='input-payment-firstname']");
	private By lastNameInput = By.xpath("//input[@id='input-payment-lastname']");
	private By companyNameInput = By.xpath("//input[@name='company']");
	private By address1Input = By.xpath("//input[@id='input-payment-address-1']");
	private By address2Input = By.xpath("//input[@id='input-payment-address-2']");
	private By cityInput = By.xpath("//input[@id='input-payment-city']");
	private By postalInput = By.xpath("//input[@id='input-payment-postcode']");
	private By country = By.id("input-payment-country");
	private By state = By.id("input-payment-zone");
	private By continueBtn = By.xpath("//input[@id='button-payment-address']");
	private By addComment = By.xpath("//textarea[@name='comment']");
	private By checkbox = By.xpath("//input[@name='agree']");
	private By paymentMethodcontinueBtn = By.xpath("//input[@id='button-payment-method']");

	public void setUserName(String username) {

		Common_Operations.clearValue(driver, inputEmail);
		Common_Operations.sendValue(driver, inputEmail, username);
	}

	public void setPassword(String password) {

		Common_Operations.clearValue(driver, inputPassword);
		Common_Operations.sendValue(driver, inputPassword, password);
	}

	public void clickLoginBtn() {

		Common_Operations.click(driver, loginBtn);

	}

	public String loginTitle() {
		return driver.getTitle();
	}

	public void clickLogout() {

		Common_Operations.click(driver, acountBtn);

		Common_Operations.selectDropdownlist(driver, listBtns, "Logout");

	}

	public String logoutTitle() {
		return driver.getTitle();
	}

	public void clickHomeIcon() {

		Common_Operations.click(driver, home);

	}

	public String itemPageTitle() {
		return driver.getTitle();
	}

	public void clickCard() throws InterruptedException {
		Common_Operations.scrollIntoView(driver, laptoptext);
		Thread.sleep(2000);
		Common_Operations.click(driver, laptoptext);
	}

	public String getItemPagetitle() {
		return driver.getTitle();

	}

	public void addItem() {

		Common_Operations.click(driver, addtocart);
	}

	public Boolean value() {

		return Common_Operations.findElement(driver, addMessge).isDisplayed();
	}

	public void clickcheckout() {

		Common_Operations.click(driver, checkoutBtn);

	}

	public String verifyCheckoutTitle() {
		return driver.getTitle();
	}

	public void clickRadioButton() {
		Common_Operations.click(driver, newaddBtn);
	}

	public void fillFirstName(String firstname) {

		Common_Operations.sendValue(driver, firstNameInput, firstname);

	}

	public void fillLastName(String lastname) {

		Common_Operations.sendValue(driver, lastNameInput, lastname);
	}

	public void fillCompanyName(String company) {

		Common_Operations.sendValue(driver, companyNameInput, company);
	}

	public void fillAddress(String address1) {

		Common_Operations.sendValue(driver, address1Input, address1);
	}

	public void fillAddress2(String address2) {

		Common_Operations.sendValue(driver, address2Input, address2);
	}

	public void fillCityName(String cityName) {

		Common_Operations.sendValue(driver, cityInput, cityName);
	}

	public void fillPostCode(String postcode) {
		Common_Operations.sendValue(driver, postalInput, postcode);
		Common_Operations.scrollIntoView(driver, continueBtn);
	}

	public void selectCountry(String countryName) throws InterruptedException {
		Thread.sleep(3000);
		Common_Operations.selectByVisibleText(driver, country, countryName);
	}

	public void selectState(String stateName) throws InterruptedException {
		Thread.sleep(3000);
		Common_Operations.selectByVisibleText(driver, state, stateName);
	}
}
