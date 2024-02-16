package com.testscript.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.utils.org.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\com\\feature\\org\\spicejetasignup.feature",
		"src\\test\\java\\com\\feature\\org\\spicejetblogin.feature",
		"src\\test\\java\\com\\feature\\org\\spicejetconewaytrip.feature",
		"src\\test\\java\\com\\feature\\org\\spicejetdroundtrip.feature",
		"src\\test\\java\\com\\feature\\org\\spicejetevalidation.feature",
		"src\\test\\java\\com\\feature\\org\\spicejetfpaymentprocess.feature"},
glue = {"com.stepdefinition.org" },
dryRun = false,
monochrome = true,
plugin = {"pretty", "json:cucumberreports\\CucumberReport.json",
						"html:cucumberreports\\CucumberReport.html" }
)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.launchBrowser("Chrome");
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.quit();
	}
}
