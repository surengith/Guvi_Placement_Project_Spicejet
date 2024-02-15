package com.stepdefinition.org;

import java.io.IOException;
import com.Pages.org.ValidateBookingPage;
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

public class ValidationStep extends BaseClass {

	ValidateBookingPage vp = new ValidateBookingPage(driver);


	@Given("user navigate to booking page")
	public void user_navigate_to_booking_page() throws IOException {
		FileReaderManager.getInstanceFRM().getInstanceCR();
		launchhUrl(ConfigProperty.getUrl());
		implicitlyWait(10);
	}

	@When("user click the check-in")
	public void user_click_the_check_in() {
		clickOnElement(vp.getCheckIn());
	}

	@And("verify the title of the check-in page")
	public void verify_the_title_of_the_check_in_page() {
		if (driver.getPageSource().contains("Web Check-In")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	@And("user click the flight status")
	public void user_click_the_flight_status() {
		clickOnElement(vp.getFlightStatus());
	}

	@And("verify the title of the flight status page")
	public void verify_the_title_of_the_flight_status_page() {
		if (driver.getPageSource().contains("Flight Status")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	@And("user click the manage booking")
	public void user_click_the_manage_booking() {
		clickOnElement(vp.getManageBooking());
	}

	@Then("verify the title of the manage booking page")
	public void verify_the_title_of_the_manage_booking_page() {
		if (driver.getPageSource().contains("View / Manage Booking")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

}
