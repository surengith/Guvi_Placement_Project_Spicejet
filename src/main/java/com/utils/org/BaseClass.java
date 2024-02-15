package com.utils.org;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions op = new ChromeOptions();
			// op.addArguments("--headless=new");
			op.addArguments("--disable-notifications");
			op.addArguments("start-maximized");
			driver = new ChromeDriver(op);
		} else if (browser.equalsIgnoreCase("Edge")) {
			EdgeOptions op = new EdgeOptions();
			// op.addArguments("--headless");
			op.addArguments("--disable-notifications");
			op.addArguments("start-maximized");
			driver = new EdgeDriver(op);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			FirefoxOptions op = new FirefoxOptions();
			// op.addArguments("--headless");
			op.addArguments("--disable-notifications");
			op.addArguments("start-maximized");
			driver = new FirefoxDriver(op);
		}
		return driver;
	}

	public static void launchhUrl(String value) {
		driver.get(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void passInputValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void selectValue(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement opt : options) {
			if (opt.getText().equals(value)) {
				opt.click();
				break;
			}
		}
	}

	public static void windowHandles(String value) {
		Set<String> child = driver.getWindowHandles();
		for (String window : child) {
			if (driver.switchTo().window(window).getTitle().equals(value)) {
			}
		}
	}

	public static void childWindowHandles(String value) {
		Set<String> child = driver.getWindowHandles();
		for (String window : child) {
			if (driver.switchTo().window(window).getTitle().equals(value)) {
				driver.close();
			}
		}
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select selCountry = new Select(element);
		selCountry.selectByVisibleText(value);
	}

	public static void scrollDownorUp(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}

	public static void pageSource(String containsValue, String sysoMessageOne, String sysoMessageTwo) {

		if (driver.getPageSource().contains(containsValue)) {
			System.out.println(sysoMessageOne);
		} else {
			System.out.println(sysoMessageTwo);
		}
	}

	public static void implicitlyWait(int value) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
	}

	public static void explictlyWait(int value, WebElement visibilityOfElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(value));
		wait.until(ExpectedConditions.visibilityOf(visibilityOfElement));
	}

	public static void explicitlyWaitClick(int value, WebElement visibilityOfAllElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(value));
		wait.until(ExpectedConditions.elementToBeClickable(visibilityOfAllElement));

	}

	public static void screenShot(String location) throws IOException {
		Date d = new Date();
		String fileName = d.toString().replace(":", "-").replace(" ", "-") + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots" + "\\" + location + fileName + ".png");
		FileUtils.copyFile(source, destination);

	}

	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

}
