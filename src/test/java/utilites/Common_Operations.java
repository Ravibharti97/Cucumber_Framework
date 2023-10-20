package utilites;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Operations {


	
	public static WebElement findElement(WebDriver driver, By locator) {

		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
			System.out.println(e);
		}

		return element;
	}
	
	
	public static void clearValue(WebDriver driver, By locator)
	{
		WebElement element= driver.findElement(locator);
		element.clear();
		
	}

	public static void clickElement(WebDriver driver, By locator) {
		
      WebElement ele= driver.findElement(locator);
      ele.click();
		
	}

	public static void sendValue(WebDriver driver,By locator, String value) {
		WebElement element=driver.findElement(locator);
		element.sendKeys(value);
		
//		ele.sendKeys(value);

	}

	public static WebElement explicitwaitclickable(WebDriver driver, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

	public static void selectDropdownlist(WebDriver driver, By dropdownvaluelocator, String value) {

		List<WebElement> dropdownvalues = driver.findElements(dropdownvaluelocator);
		for (WebElement list : dropdownvalues) {

			if (list.getText().contains(value)) {
				list.click();
				break;
			}
		}
	}

	public static void scrollIntoView(WebDriver driver, By lcator) {
		WebElement element=driver.findElement(lcator);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}


//	public static void implicitlyWait(WebDriver driver, int seconds) {
//		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
//
//	}
//	
//	public static void clearValue(WebElement ele) {
//		
//		ele.clear();
//	}
	public static void click(WebDriver driver, By locator) {
//		explicitwait(driver, locator);

		try {
			Common_Operations.findElement(driver, locator).click();

		} catch (ElementClickInterceptedException | StaleElementReferenceException e) {
			Common_Operations.findElement(driver, locator).click();

		}

	}
	
	public static void selectByVisibleText(WebDriver driver, By locator,  String value) {
		WebElement element= driver.findElement(locator);
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
		
		
	}

}
