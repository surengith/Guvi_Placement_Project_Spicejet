package com.stepdefinition.org;

import java.io.IOException;
import org.testng.internal.junit.ArrayAsserts;
import com.Pages.org.Signup;
import com.utils.org.BaseClass;
import com.utils.org.ConfigProperty;
import com.utils.org.FileReaderManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SignupStep1 extends BaseClass {

	public static Signup sip = new Signup(driver);
	
	
	@Before
	public void beforeHooks(Scenario spicejet) {

		String name = spicejet.getName();
		System.out.println("BeforeHooks: " + name);
	}

	@After
	public void afterHooks(Scenario spicejet) throws IOException {

		Status status = spicejet.getStatus();
		String name = spicejet.getName();
		screenShot(name);
		System.out.println("AfterHooks: " + status);
		if (spicejet.isFailed()) {
			screenShot(name);
		}
	}
	
	

	@Given("user must launch the url")
	public static void user_must_launch_the_url() throws IOException {
		FileReaderManager.getInstanceFRM().getInstanceCR();
		launchhUrl(ConfigProperty.getUrl());
		implicitlyWait(10);
	}

	@When("user click the signup button for valid")
	public void user_click_the_signup_button_for_valid() {
		explictlyWait(5, sip.getSignupButton());
		clickOnElement(sip.getSignupButton());
	}

	@And("user navigate to the signup page for valid")
	public void user_navigate_to_the_signup_page_for_valid() {
		windowHandles("SpiceClub - The frequent flyer program of SpiceJet");
	}

	@And("user enter the valid {string} in the title field")
	public void user_enter_the_valid_in_the_title_field(String string) {
		selectValue(sip.getSelectSalutation(), string);
	}

	@And("user enter the valid {string} in the firstname field")
	public void user_enter_the_valid_in_the_firstname_field(String string) {
		passInputValue(sip.getSignupFirstName(), string);
	}

	@And("user enter the valid {string} in the lastname field")
	public void user_enter_the_valid_in_the_lastname_field(String string) {
		passInputValue(sip.getSignupLastName(), string);
	}

	@And("user select the valid {string}")
	public void user_select_the_valid(String string) {
		selectByVisibleText(sip.getSelectCountry(), string);
	}

	@And("user select the valid  dateofbirth in the calendar field")
	public void user_select_the_valid_dateofbirth_in_the_calendar_field() throws InterruptedException {
		clickOnElement(sip.getDobCalendar());
		selectByVisibleText(sip.getSelectMonth(), "February");
		selectByVisibleText(sip.getSelectYear(), "1975");
		clickOnElement(sip.getDobDate());
		scrollDownorUp("window.scrollBy(0,500)");
		sleep(1000);
		explictlyWait(5, sip.getSignupPhoneNumber());
	}

	@And("user enter the valid {string} in the phone number field")
	public void user_enter_the_valid_in_the_phone_number_field(String string) throws InterruptedException {
		passInputValue(sip.getSignupPhoneNumber(), string);
		sleep(1000);
	}

	@And("user enter the valid {string} in the email field")
	public void user_enter_the_valid_in_the_email_field(String string) throws InterruptedException {
		clickOnElement(sip.getSignupEmailId());
		sleep(1000);
		passInputValue(sip.getSignupEmailId(), string);
	}

	@And("user enter the valid {string} in the password field")
	public void user_enter_the_valid_in_the_password_field(String string) throws InterruptedException {
		sleep(2000);
		clickOnElement(sip.getSignupPassword());
		sleep(2000);
		passInputValue(sip.getSignupPassword(), string);
	}

	@And("user enter the valid {string} in the confirmpassword field")
	public void user_enter_the_valid_in_the_confirmpassword_field(String string) throws InterruptedException {
		sleep(1000);
		clickOnElement(sip.getSignupConfirmPassword());
		sleep(1000);
		passInputValue(sip.getSignupConfirmPassword(), string);
		sleep(1000);
	}

	@And("user click the iagree and submit button for valid")
	public void user_click_the_iagree_and_submit_button_for_valid() throws InterruptedException {
		clickOnElement(sip.getiAgreeButton());
		clickOnElement(sip.getSubmitButton());
		sleep(2000);
	}

	@And("user verify the OTP")
	public void user_verify_the_otp() throws InterruptedException {
		pageSource("OTP", "Page has been verified successfully", "Page is not verified");
	}

	@Then("user switch back to parent window for valid")
	public void user_switch_back_to_parent_window_for_valid() throws InterruptedException {
		sleep(2000);
		childWindowHandles("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}

	@When("user click the signup button for invalid")
	public void user_click_the_signup_button_for_invalid() {
		explictlyWait(5, sip.getSignupButton());
		clickOnElement(sip.getSignupButton());
	}

	@And("user navigate to the signup page for invalid")
	public void user_navigate_to_the_signup_page_for_invalid() {
		windowHandles("SpiceClub - The frequent flyer program of SpiceJet");
	}

	@And("user enter the {string} in the title field")
	public void user_enter_the_in_the_title_field(String string) {
		selectValue(sip.getSelectSalutation(), string);
	}

	@And("user enter the {string} in the firstname field")
	public void user_enter_the_in_the_firstname_field(String string) {
		passInputValue(sip.getSignupFirstName(), string);
	}

	@And("user enter the {string} in the lastname field")
	public void user_enter_the_in_the_lastname_field(String string) {
		passInputValue(sip.getSignupLastName(), string);
	}

	@And("user select the {string}")
	public void user_select_the(String string) {
		selectByVisibleText(sip.getSelectCountry(), string);
	}

	@And("user select the dateofbirth in the calendar field")
	public void user_select_the_dateofbirth_in_the_calendar_field() throws InterruptedException {
		clickOnElement(sip.getDobCalendar());
		selectByVisibleText(sip.getSelectMonth(), "February");
		selectByVisibleText(sip.getSelectYear(), "1975");
		clickOnElement(sip.getDobDate());
		scrollDownorUp("window.scrollBy(0,500)");
		sleep(1000);
		explictlyWait(5, sip.getSignupPhoneNumber());
	}

	@And("user enter the {string} in the phone number field")
	public void user_enter_the_in_the_phone_number_field(String string) throws InterruptedException {
		passInputValue(sip.getSignupPhoneNumber(), string);
		sleep(1000);
	}

	@And("user enter the {string} in the email field")
	public void user_enter_the_in_the_email_field(String string) throws InterruptedException {
		clickOnElement(sip.getSignupEmailId());
		sleep(1000);
		passInputValue(sip.getSignupEmailId(), string);
	}

	@And("user enter the invalid {string} in the password field")
	public void user_enter_the_invalid_in_the_password_field(String string) throws InterruptedException {
		sleep(2000);
		clickOnElement(sip.getSignupPassword());
		sleep(2000);
		passInputValue(sip.getSignupPassword(), string);
	}

	@And("user enter the invalid {string} in the confirmpassword field")
	public void user_enter_the_invalid_in_the_confirmpassword_field(String string) throws InterruptedException {
		sleep(1000);
		clickOnElement(sip.getSignupConfirmPassword());
		sleep(1000);
		passInputValue(sip.getSignupConfirmPassword(), string);
		sleep(1000);
	}

	@And("user click the iagree and submit button for invalid")
	public void user_click_the_iagree_and_submit_button_for_invalid() throws InterruptedException {
		clickOnElement(sip.getiAgreeButton());
		clickOnElement(sip.getSubmitButton());
		sleep(2000);
	}

	@And("User should get a proper warning message about Password characters")
	public void user_should_get_a_proper_warning_message_about_password_characters() {
		pageSource("Password length should be", "Page has been verified successfully", "Page is not verified");
	}

	@Then("user switch back to parent window for invalid")
	public void user_switch_back_to_parent_window_for_invalid() throws InterruptedException {
		sleep(2000);
		childWindowHandles("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}

	@When("user click the signup button for empty")
	public void user_click_the_signup_button_for_empty() {
		explictlyWait(5, sip.getSignupButton());
		clickOnElement(sip.getSignupButton());
	}

	@And("user navigate to the signup page for empty")
	public void user_navigate_to_the_signup_page_for_empty() {
		windowHandles("SpiceClub - The frequent flyer program of SpiceJet");
	}

	@And("user click the iagree and submit button for empty")
	public void user_click_the_iagree_and_submit_button_for_empty() throws InterruptedException {
		scrollDownorUp("window.scrollBy(0,600)");
		sleep(2000);
		clickOnElement(sip.getiAgreeButton());
		clickOnElement(sip.getSubmitButton());
		sleep(2000);
	}

	@And("User should get a proper warning message about Please fill all mandatory fields marked with an {string} to proceed")
	public void user_should_get_a_proper_warning_message_about_please_fill_all_mandatory_fields_marked_with_an_to_proceed(
			String string) throws InterruptedException {
		scrollDownorUp("window.scrollBy(500,0)");
		sleep(1000);
		pageSource("Please fill all mandatory fields", "Page has been verified successfully", "Page is not verified");
	}

	@Then("user switch back to parent window for empty")
	public void user_switch_back_to_parent_window_for_empty() throws InterruptedException {
		sleep(2000);
		childWindowHandles("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}

}
