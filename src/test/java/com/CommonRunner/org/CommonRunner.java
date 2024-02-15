package com.CommonRunner.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import com.Pages.org.FlightOneWayBooking;
import com.Pages.org.FlightRoundTripBooking;
import com.Pages.org.Login;
import com.Pages.org.Signup;
import com.Pages.org.ValidateBookingPage;
import com.utils.org.BaseClass;
import com.utils.org.ConfigProperty;
import com.utils.org.FileReaderManager;

import junit.framework.Assert;

public class CommonRunner extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		ConfigProperty instanceCR = FileReaderManager.getInstanceFRM().getInstanceCR();

		// ChromeOptions op = new ChromeOptions();
		// op.addArguments("--disable-notifications");
		// op.addArguments("start-maximized");
		// WebDriver driver = new ChromeDriver(op);
		driver = launchBrowser(instanceCR.getBrowser());

		// JavascriptExecutor js = (JavascriptExecutor) driver;

		// driver.get("https://www.spicejet.com/");
		launchhUrl(instanceCR.getUrl());
		implicitlyWait(10);

		// Signup page
		Signup sip = new Signup(driver);

		// Thread.sleep(3000); // sleep(3000);
		explictlyWait(5, sip.getSignupButton());

		// WebElement signupButton =
		// driver.findElement(By.xpath("//div[contains(text(),'Signup')]"));
		// signupButton.click();
		clickOnElement(sip.getSignupButton());

		String parent = driver.getWindowHandle();

		// Set<String> child = driver.getWindowHandles(); //
		// for (String window : child) { // if
		// (driver.switchTo().window(window).getTitle()
		// .equals("SpiceClub - The frequent flyer program of SpiceJet")) { // } // }
		windowHandles("SpiceClub - The frequent flyer program of SpiceJet");

		// WebElement selectSalutation
		// =driver.findElement(By.xpath("//select[@class='form-control form-select
		// ']"));
		// Select selSalutation = new Select(selectSalutation);
		// List<WebElement>valueOfSalutation = selSalutation.getOptions();
		// for (WebElement salutation: valueOfSalutation) { // if
		// (salutation.getText().equals("Mrs")) {
		// salutation.click(); // break; // } // }
		selectValue(sip.getSelectSalutation(), "Mr");

		// WebElement signupFirstName =
		// driver.findElement(By.xpath("//input[@id='first_name']"));
		// signupFirstName.sendKeys("Surendhar");
		passInputValue(sip.getSignupFirstName(), "Surendhar");

		// WebElement signupLastName =
		// driver.findElement(By.xpath("//input[@id='last_name']"));
		// signupLastName.sendKeys("P");
		passInputValue(sip.getSignupLastName(), "P");

		// WebElement selectCountry =driver.findElement(By.xpath("//select[@tabindex='0']"));
		// Select selCountry= new Select(selectCountry);
		// selCountry.selectByVisibleText("New Zealand ");
		selectByVisibleText(sip.getSelectCountry(), "New Zealand ");

		// WebElement dobCalendar
		// =driver.findElement(By.xpath("//input[@id='dobDate']"));
		// dobCalendar.click();
		clickOnElement(sip.getDobCalendar());

		// WebElement selectMonth =
		// driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		// Select selMonth = new Select(selectMonth);
		// selMonth.selectByVisibleText("February");
		selectByVisibleText(sip.getSelectMonth(), "February");

		// WebElement selectYear =
		// driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		// Select selYear = new Select(selectYear); //
		// selYear.selectByVisibleText("1975");
		selectByVisibleText(sip.getSelectYear(), "1975");

		// WebElement dobDate = driver.findElement(By.xpath("//div[text()='29']"));
		// dobDate.click(); 
		clickOnElement(sip.getDobDate());

		// js.executeScript("window.scrollBy(0,500)");
		scrollDownorUp("window.scrollBy(0,500)");

		sleep(1000);
		explictlyWait(5, sip.getSignupPhoneNumber());
		// WebElement signupPhoneNumber =
		// driver.findElement(By.xpath("//input[@type='tel']"));
		// signupPhoneNumber.sendKeys("7896541230");
		passInputValue(sip.getSignupPhoneNumber(), "7896541230");

		sleep(1000);
		// WebElement signupEmailId =
		// driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		// signupEmailId.click();
		clickOnElement(sip.getSignupEmailId());
		sleep(1000);
		// signupEmailId.sendKeys("surendhar01@gmail.com");
		passInputValue(sip.getSignupEmailId(), "surendhar01@gmail.com");

		// Thread.sleep(2000);
		sleep(2000);
		// WebElement signupPassword =
		// driver.findElement(By.xpath("//input[@id='new-password']"));
		// signupPassword.click();
		clickOnElement(sip.getSignupPassword());
		sleep(2000);
		// signupPassword.sendKeys("SpiceJet@123$");
		passInputValue(sip.getSignupPassword(), "SpiceJet@123$");

		sleep(1000);
		// WebElement signupConfirmPassword =
		// driver.findElement(By.xpath("//input[@id='c-password']"));
		// signupConfirmPassword.click();
		clickOnElement(sip.getSignupConfirmPassword());
		sleep(1000);
		// signupConfirmPassword.sendKeys("SpiceJet@123$");
		passInputValue(sip.getSignupConfirmPassword(), "SpiceJet@123$");

		sleep(1000);
		// WebElement iAgreeButton
		// =driver.findElement(By.xpath("//input[@type='checkbox']"));
		// iAgreeButton.click();
		clickOnElement(sip.getiAgreeButton());

		// WebElement submitButton =
		// driver.findElement(By.xpath("//button[text()='Submit']"));
		// submitButton.click();
		clickOnElement(sip.getSubmitButton());
		sleep(2000);

		pageSource("OTP", "Page has been verified successfully", "Page is not verified");

		driver.switchTo().window(parent);

		// Login page

		Login lp = new Login(driver);

		sleep(3000);
		// WebElement loginButton =
		// driver.findElement(By.xpath("//div[text()='Login']"));
		// loginButton.click();
		clickOnElement(lp.getLoginButton());

		sleep(2000);
		// WebElement loginPageEmailButton =
		// driver.findElement(By.xpath("//div[text()='Email']"));
		// loginPageEmailButton.click();
		clickOnElement(lp.getLoginPageEmailButton());

		sleep(2000);
		// WebElement loginPageEmail =
		// driver.findElement(By.xpath("//input[@type='email']"));
		// loginPageEmail.sendKeys("surendhar01@gmail.com");
		passInputValue(lp.getLoginPageEmail(), "surendhar01@gmail.com");

		sleep(2000);
		// WebElement loginPagePassword
		// =driver.findElement(By.xpath("//input[@type='password']"));
		// loginPagePassword.sendKeys("SpiceJet@123$");
		passInputValue(lp.getLoginPagePassword(), "SpiceJet@123$");

		sleep(2000);
		// WebElement loginPageLoginButton =
		// driver.findElement(By.xpath("//div[@data-testid='login-cta']"));
		// loginPageLoginButton.click();
		clickOnElement(lp.getLoginPageLoginButton());

		// WebElement loginPageCloseButton
		// =driver.findElement(By.xpath("(//*[name()='path'])[17]"));
		// loginPageCloseButton.click();
		explicitlyWaitClick(10, lp.getLoginPageCloseButton());
		clickOnElement(lp.getLoginPageCloseButton());

		// Flight One Way passenger details

		FlightOneWayBooking fob = new FlightOneWayBooking(driver);

		// Thread.sleep(2000); explicitlyWaitClick(2, fob.getOnewayButton()); //
		//WebElement onewayButton = driver.findElement(By.xpath("//div[text()='one way']")); //
		//onewayButton.click();
		clickOnElement(fob.getOnewayButton());

		// Thread.sleep(2000);
		explicitlyWaitClick(2, fob.getFromOriginClick());
		// WebElement fromOriginClick =
		// driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		// fromOriginClick.click();
		clickOnElement(fob.getFromOriginClick());
		// explictlyWait(2, fob.getFromOriginClick());
		// Thread.sleep(2000);
		// fromOriginClick.sendKeys("DEL");
		passInputValue(fob.getFromOriginClick(), "DEL");

		// Thread.sleep(2000);
		explicitlyWaitClick(2, fob.getToDestination());
		// WebElement toDestination =
		// driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		// toDestination.click();
		clickOnElement(fob.getToDestination());
		// Thread.sleep(2000);
		// toDestination.sendKeys("MAA");
		// explictlyWait(2,fob.getToDestination());
		passInputValue(fob.getToDestination(), "MAA");

		// Thread.sleep(2000);
		explicitlyWaitClick(2, fob.getOneWayTripDepartureDatePicker());
		// WebElement oneWayTripDepartureDatePicker = driver.findElement( // By.
		// xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar
		// r-16dba41'][normalize-space()='29'])[1]"));
		// oneWayTripDepartureDatePicker.click();
		clickOnElement(fob.getOneWayTripDepartureDatePicker());

		// Thread.sleep(2000);
		explictlyWait(2, fob.getPassengers());
		// WebElement passengers =
		// driver.findElement(By.xpath("//div[text()='Passengers']"));
		// passengers.click();
		clickOnElement(fob.getPassengers());

		// Thread.sleep(2000);
		// WebElement adult =
		// driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[18]"));
		// adult.click();
		explicitlyWaitClick(2, fob.getAdult());
		clickOnElement(fob.getAdult());

		// Thread.sleep(2000); explicitlyWaitClick(2, fob.getSearchButton());
		// WebElement searchButton = driver.findElement(By.xpath( //
		// "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci
		// r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']" )); // Thread.sleep(2000);
		// explicitlyWaitClick(2, fob.getSearchButton());
		// searchButton.click();
		clickOnElement(fob.getSearchButton());

		// Select flight and timing
		////// Thread.sleep(5000);
		////// WebElement spiceMax
		// =driver.findElement(By.xpath("(//*[name()='circle'])[6]"));
		////// Thread.sleep(5000);
		////// spiceMax.click();

		// Thread.sleep(9000); explicitlyWaitClick(10, fob.getContinueButton());
		// WebElement continueButton
		// =driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']"));
		// continueButton.click();
		clickOnElement(fob.getContinueButton());

		// Booking contact page Thread.sleep(8000);
		explicitlyWaitClick(8, fob.getSelectSalutationBooking());
		// WebElement selectSalutationBooking =
		// driver.findElement(By.xpath("(//div[text()='Mr'][text()='Mr'])[1]"));
		// selectSalutationBooking.click();
		clickOnElement(fob.getSelectSalutationBooking());

		// Thread.sleep(1000); // WebElement selectSalutationBookingDrop
		// =driver.findElement(By.xpath("(//div[text()='Mr'][text()='Mr'])[2]"));
		// selectSalutationBookingDrop.click();
		clickOnElement(fob.getSelectSalutationBookingDrop());

		// Thread.sleep(1000); // WebElement contactDetailsFirstName
		// =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		// contactDetailsFirstName.sendKeys("Surendhar");
		passInputValue(fob.getContactDetailsFirstName(), "Surendhar");

		// Thread.sleep(1000); // WebElement contactDetailsLastName
		// =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		// contactDetailsLastName.sendKeys("P");
		passInputValue(fob.getContactDetailsLastName(), "P");

		// Thread.sleep(1000); // WebElement contactDetailsPhoneNumber
		// =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		// contactDetailsPhoneNumber.sendKeys("9443352021");
		passInputValue(fob.getContactDetailsPhoneNumber(), "9443352021");

		// Thread.sleep(1000); // WebElement contactDetailsEmail
		// =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		// contactDetailsEmail.click();
		clickOnElement(fob.getContactDetailsEmail());
		// Thread.sleep(3000);
		// contactDetailsEmail.sendKeys("surendhar01@gmail.com");
		passInputValue(fob.getContactDetailsEmail(), "surendhar01@gmail.com");

		// Thread.sleep(1000);
		// WebElement contactDetailsTown
		// driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		// contactDetailsTown.sendKeys("Coimbatore");
		passInputValue(fob.getContactDetailsTown(), "Coimbatore");

		// Passengers one details
		// Thread.sleep(1000);
		// WebElement selectSalutationPassengerOne =
		// driver.findElement(By.xpath("(//div[text()='Mr'])[2]"));
		// selectSalutationPassengerOne.click();
		clickOnElement(fob.getSelectSalutationPassengerOne());

		// Thread.sleep(1000); // WebElement selectSalutationPassengerOneDrop
		// =driver.findElement(By.xpath("(//div[text()='Mr'])[3]"));
		// selectSalutationPassengerOneDrop.click();
		clickOnElement(fob.getSelectSalutationPassengerOneDrop());

		// Thread.sleep(1000);
		// WebElement PassengerOneFirstNameOne =
		// driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		// PassengerOneFirstNameOne.sendKeys("Surendhar");
		passInputValue(fob.getPassengerOneFirstNameOne(), "Surendhar");

		// Thread.sleep(1000);
		// WebElement PassengerOneLastNameOne =
		// driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		// PassengerOneLastNameOne.sendKeys("P");
		passInputValue(fob.getPassengerOneLastNameOne(), "P");

		// Thread.sleep(1000);
		// WebElement PassengerOnePhoneNumberOne
		// =driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		// PassengerOnePhoneNumberOne.sendKeys("9443352021");
		passInputValue(fob.getPassengerOnePhoneNumberOne(), "9443352021");

		// Thread.sleep(1000);
		// WebElement passengerTwoDropArrow =
		// driver.findElement(By.xpath("//div[text()='Next']"));
		// passengerTwoDropArrow.click();
		clickOnElement(fob.getPassengerTwoDropArrow());

		// Passenger two details
		// Thread.sleep(1000);
		// WebElement selectSalutationPassengerTwo =
		// driver.findElement(By.xpath("(//div[text()='Mr'])[2]"));
		// selectSalutationPassengerTwo.click();
		clickOnElement(fob.getSelectSalutationPassengerTwo());

		// Thread.sleep(1000);
		// WebElement selectSalutationPassengerTwoDrop =
		// driver.findElement(By.xpath("(//div[text()='Mr'])[3]"));
		// selectSalutationPassengerTwoDrop.click();
		clickOnElement(fob.getSelectSalutationPassengerTwoDrop());

		// Thread.sleep(1000);
		// WebElement PassengerOneFirstNameTwo =
		// driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		// PassengerOneFirstNameTwo.sendKeys("Suren");
		passInputValue(fob.getPassengerOneFirstNameTwo(), "Suren");

		// Thread.sleep(1000);
		// WebElement PassengerOneLastNameTwo
		// =driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		// PassengerOneLastNameTwo.sendKeys("P");
		passInputValue(fob.getPassengerOneLastNameTwo(), "P");

		// Thread.sleep(1000);
		// WebElement PassengerOnePhoneNumberTwo =
		// driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		// PassengerOnePhoneNumberTwo.sendKeys("9443352021");
		passInputValue(fob.getPassengerOnePhoneNumberTwo(), "9443352021");

		Thread.sleep(5000);
		// explicitlyWaitClick(5,fob.getPaymentContinueButton());
		// WebElement paymentContinueButton =
		// driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']"));
		// paymentContinueButton.click();
		clickOnElement(fob.getPaymentContinueButton());

		////// js.executeScript("window.scrollBy(0,1500)");
		////// WebElement paymentContinue =
		////// driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]"));
		////// paymentContinue.click(); ////
		////// Thread.sleep(2000);
		////// js.executeScript("window.scrollBy(1500,0)");
		// WebElement homePage =
		////// driver.findElement(By.xpath("//img[@src='https://www.spicejet.com/public/v1.svg']"));
		// homePage.click(); //explictlyWait(10, fob.getHomePage());

		Thread.sleep(10000);
		clickOnElement(fob.getHomePage());

		// Flight Round Trip passenger details

		FlightRoundTripBooking frb = new FlightRoundTripBooking(driver);

//		WebElement roundTripButton = driver.findElement(By.xpath("(//*[name()='circle'])[3]"));
//		roundTripButton.click();
		clickOnElement(frb.getRoundTripButton());

		// Thread.sleep(2000);
//		WebElement roundTripFromOriginClick = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		roundTripFromOriginClick.click();
		clickOnElement(frb.getRoundTripFromOriginClick());
		// Thread.sleep(2000);
//		roundTripFromOriginClick.sendKeys("DEL");
		passInputValue(frb.getRoundTripFromOriginClick(), "DEL");

		// Thread.sleep(2000);
//		WebElement roundTripToDestination = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		roundTripToDestination.click();
		clickOnElement(frb.getRoundTripToDestination());
		// Thread.sleep(2000);
//		roundTripToDestination.sendKeys("MAA");
		passInputValue(frb.getRoundTripToDestination(), "MAA");

//		Thread.sleep(5000);
//		explicitlyWaitClick(5, frb.getRoundTripDepartureDatePicker());
//		WebElement roundTripDepartureDatePicker = driver.findElement(
//				By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][normalize-space()='29'])[1]"));
//		roundTripDepartureDatePicker.click();
		sleep(3000);
		clickOnElement(frb.getRoundTripDepartureDatePicker());

		// Thread.sleep(2000);
//		WebElement roundTripReturnDatePicker = driver.findElement(By.xpath(
//				"(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'][normalize-space()='3'])[2]"));
//		roundTripReturnDatePicker.click();
		sleep(3000);
		clickOnElement(frb.getRoundTripReturnDatePicker());

		// Thread.sleep(2000);
//		WebElement roundTripPassengers = driver.findElement(By.xpath("//div[text()='Passengers']"));
//		roundTripPassengers.click();
		clickOnElement(frb.getRoundTripPassengers());

		// Thread.sleep(2000);
//		WebElement roundTripAdult = driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[18]"));
//		roundTripAdult.click();
		clickOnElement(frb.getRoundTripAdult());

		// Thread.sleep(3000);
//		WebElement roundTripSearchButton = driver.findElement(By.xpath(
//				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"));
		// Thread.sleep(2000);
//		roundTripSearchButton.click();
		clickOnElement(frb.getRoundTripSearchButton());

//		Thread.sleep(9000);
		explicitlyWaitClick(9, frb.getContinueButtonRound());
//		WebElement continueButtonRound = driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']"));
//		continueButtonRound.click();
		clickOnElement(frb.getContinueButtonRound());

		// Booking contact page
//		Thread.sleep(8000);
		explicitlyWaitClick(8, frb.getSelectSalutationBookingRound());
//		WebElement selectSalutationBookingRound = driver.findElement(By.xpath("(//div[text()='Mr'][text()='Mr'])[1]"));
//		selectSalutationBookingRound.click();
		clickOnElement(frb.getSelectSalutationBookingRound());

		// Thread.sleep(1000);
//		WebElement selectSalutationBookingDropRound = driver
//				.findElement(By.xpath("(//div[text()='Mr'][text()='Mr'])[2]"));
//		selectSalutationBookingDropRound.click();
		clickOnElement(frb.getSelectSalutationBookingDropRound());

		// Thread.sleep(1000);
//		WebElement contactDetailsFirstNameRound = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		contactDetailsFirstNameRound.sendKeys("Surendhar");
		passInputValue(frb.getContactDetailsFirstNameRound(), "Surendhar");

		// Thread.sleep(1000);
//		WebElement contactDetailsLastNameRound = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		contactDetailsLastNameRound.sendKeys("P");
		passInputValue(frb.getContactDetailsLastNameRound(), "P");

		// Thread.sleep(1000);
//		WebElement contactDetailsPhoneNumberRound = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		contactDetailsPhoneNumberRound.sendKeys("9443352021");
		passInputValue(frb.getContactDetailsPhoneNumberRound(), "9443352021");

		// Thread.sleep(1000);
//		WebElement contactDetailsEmailRound = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//		contactDetailsEmailRound.click();
		clickOnElement(frb.getContactDetailsEmailRound());
		// Thread.sleep(3000);
//		contactDetailsEmailRound.sendKeys("surendhar01@gmail.com");
		passInputValue(frb.getContactDetailsEmailRound(), "surendhar01@gmail.com");

		// Thread.sleep(1000);
//		WebElement contactDetailsTownRound = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//		contactDetailsTownRound.sendKeys("Coimbatore");
		passInputValue(frb.getContactDetailsTownRound(), "Coimbatore");

		// Passengers one details
		// Thread.sleep(1000);
//		WebElement selectSalutationPassengerOneRound = driver.findElement(By.xpath("(//div[text()='Mr'])[2]"));
//		selectSalutationPassengerOneRound.click();
		clickOnElement(frb.getSelectSalutationPassengerOneRound());

		// Thread.sleep(1000);
//		WebElement selectSalutationPassengerOneDropRound = driver.findElement(By.xpath("(//div[text()='Mr'])[3]"));
//		selectSalutationPassengerOneDropRound.click();
		clickOnElement(frb.getSelectSalutationPassengerOneRound());

		// Thread.sleep(1000);
//		WebElement PassengerOneFirstNameOneRound = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//		PassengerOneFirstNameOneRound.sendKeys("Surendhar");
		passInputValue(frb.getPassengerOneFirstNameOneRound(), "Surendhar");

		// Thread.sleep(1000);
//		WebElement PassengerOneLastNameOneRound = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//		PassengerOneLastNameOneRound.sendKeys("P");
		passInputValue(frb.getPassengerOneLastNameOneRound(), "P");

		// Thread.sleep(1000);
//		WebElement PassengerOnePhoneNumberOneRound = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		PassengerOnePhoneNumberOneRound.sendKeys("9443352021");
		passInputValue(frb.getPassengerOnePhoneNumberOneRound(), "9443352021");

		// Thread.sleep(1000);
//		WebElement passengerTwoDropArrowRound = driver.findElement(By.xpath("//div[text()='Next']"));
//		passengerTwoDropArrowRound.click();
		clickOnElement(frb.getPassengerTwoDropArrowRound());

		// Passenger two details
		// Thread.sleep(1000);
//		WebElement selectSalutationPassengerTwoRound = driver.findElement(By.xpath("(//div[text()='Mr'])[2]"));
//		selectSalutationPassengerTwoRound.click();
		clickOnElement(frb.getSelectSalutationPassengerTwoRound());

		// Thread.sleep(1000);
//		WebElement selectSalutationPassengerTwoDropRound = driver.findElement(By.xpath("(//div[text()='Mr'])[3]"));
//		selectSalutationPassengerTwoDropRound.click();
		clickOnElement(frb.getSelectSalutationPassengerTwoDropRound());

		// Thread.sleep(1000);
//		WebElement PassengerOneFirstNameTwoRound = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//		PassengerOneFirstNameTwoRound.sendKeys("Suren");
		passInputValue(frb.getPassengerOneFirstNameTwoRound(), "Suren");

		// Thread.sleep(1000);
//		WebElement PassengerOneLastNameTwoRound = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//		PassengerOneLastNameTwoRound.sendKeys("P");
		passInputValue(frb.getPassengerOneLastNameTwoRound(), "P");

		// Thread.sleep(1000);
//		WebElement PassengerOnePhoneNumberTwoRound = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		PassengerOnePhoneNumberTwoRound.sendKeys("9443352021");
		passInputValue(frb.getPassengerOnePhoneNumberTwoRound(), "9443352021");

//		Thread.sleep(3000);
		explicitlyWaitClick(5, frb.getPaymentContinueButtonRound());
//		WebElement paymentContinueButtonRound = driver
//				.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']"));
//		paymentContinueButtonRound.click();
		clickOnElement(frb.getPaymentContinueButtonRound());

//		sleep(7000);
//////		js.executeScript("window.scrollBy(0,1500)");
//////		WebElement paymentContinue = driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]"));
//////		paymentContinue.click();
////
//////		Thread.sleep(2000);
//////		js.executeScript("window.scrollBy(1500,0)");
//		WebElement homePageRound = driver.findElement(By.xpath("//img[@src='https://www.spicejet.com/public/v1.svg']"));
//		homePageRound.click();

		// explicitlyWaitClick(10, frb.getHomePageRound());
		sleep(7000);
		clickOnElement(frb.getHomePageRound());

		// validate booking page

		ValidateBookingPage vp = new ValidateBookingPage(driver);

//		WebElement checkIn = driver.findElement(By.xpath("//div[text()='check-in']"));
//		checkIn.click();
		clickOnElement(vp.getCheckIn());
		if (driver.getPageSource().contains("Web Check-In")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

//		WebElement flightStatus = driver.findElement(By.xpath("//div[text()='flight status']"));
//		flightStatus.click();
		clickOnElement(vp.getFlightStatus());
		if (driver.getPageSource().contains("Flight Status")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

//		WebElement manageBooking = driver.findElement(By.xpath("//div[text()='manage booking']"));
//		manageBooking.click();
		clickOnElement(vp.getManageBooking());
		if (driver.getPageSource().contains("View / Manage Booking")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

		System.out.println("All Done");

//		 driver.quit();
		quit();
	}
}
