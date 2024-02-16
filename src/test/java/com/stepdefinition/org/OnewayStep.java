package com.stepdefinition.org;

import java.io.IOException;

import com.Pages.org.FlightOneWayBooking;
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

public class OnewayStep extends BaseClass {

	FlightOneWayBooking fob = new FlightOneWayBooking(driver);
	

	@Given("user navigate to booking page for oneway")
	public void user_navigate_to_booking_page_for_oneway() throws IOException {
		FileReaderManager.getInstanceFRM().getInstanceCR();
		launchhUrl(ConfigProperty.getUrl());
		implicitlyWait(10);
	}

	@When("user click the oneway button on booking page for oneway")
	public void user_click_the_oneway_button_on_booking_page_for_oneway() {
		clickOnElement(fob.getOnewayButton());
	}

	@And("user select the origin place from the from field for oneway")
	public void user_select_the_origin_place_from_the_from_field_for_oneway() {
		explicitlyWaitClick(10, fob.getFromOriginClick());
		clickOnElement(fob.getFromOriginClick());
		passInputValue(fob.getFromOriginClick(), "DEL");
	}

	@And("user select the Destination place from the Destination field for oneway")
	public void user_select_the_destination_place_from_the_destination_field_for_oneway() {
		explicitlyWaitClick(10, fob.getToDestination());
		clickOnElement(fob.getToDestination());
		passInputValue(fob.getToDestination(), "MAA");
	}

	@And("user select the departure date on the date field for oneway")
	public void user_select_the_departure_date_on_the_date_field_for_oneway() {
		explicitlyWaitClick(10, fob.getOneWayTripDepartureDatePicker());
		clickOnElement(fob.getOneWayTripDepartureDatePicker());
	}

	@And("user click the passenger and add the passenger for oneway")
	public void user_click_the_passenger_and_add_the_passenger_for_oneway() {
		explictlyWait(2, fob.getPassengers());
		clickOnElement(fob.getPassengers());
		explicitlyWaitClick(10, fob.getAdult());
		clickOnElement(fob.getAdult());
	}

	@And("user click the search flight button for oneway")
	public void user_click_the_search_flight_button_for_oneway() {
		clickOnElement(fob.getSearchButton());
	}

	@And("user click the continue button for oneway")
	public void user_click_the_continue_button_for_oneway() {
		clickOnElement(fob.getContinueButton());
	}

	@And("user select the valid salutation in the salutation field for oneway")
	public void user_select_the_valid_salutation_in_the_salutation_field_for_oneway() {
		explicitlyWaitClick(10, fob.getSelectSalutationBooking());
		clickOnElement(fob.getSelectSalutationBooking());
		clickOnElement(fob.getSelectSalutationBookingDrop());
	}

	@And("user enter the valid {string} in the firstname field for oneway")
	public void user_enter_the_valid_in_the_firstname_field_for_oneway(String string) {
		passInputValue(fob.getContactDetailsFirstName(), string);

	}

	@And("user enter the valid {string} in the lastname field for oneway")
	public void user_enter_the_valid_in_the_lastname_field_for_oneway(String string) {
		passInputValue(fob.getContactDetailsLastName(), string);

	}

	@And("user enter the valid {string} in the phonenumberfield for oneway")
	public void user_enter_the_valid_in_the_phonenumberfield_for_oneway(String string) {
		passInputValue(fob.getContactDetailsPhoneNumber(), string);

	}

	@And("user enter the valid {string} in the Email field for oneway")
	public void user_enter_the_valid_in_the_email_field_for_oneway(String string) {
		clickOnElement(fob.getContactDetailsEmail());
		passInputValue(fob.getContactDetailsEmail(), string);
	}

	@And("user enter the valid {string} in the Town field for oneway")
	public void user_enter_the_valid_in_the_town_field_for_oneway(String string) {
		passInputValue(fob.getContactDetailsTown(), string);
		explictlyWait(10, fob.getRetainMyDetails());
		clickOnElement(fob.getRetainMyDetails());
	}

	@And("user select the valid passenger one salutation in the salutation field for oneway")
	public void user_select_the_valid_passenger_one_salutation_in_the_salutation_field_for_oneway() {
		clickOnElement(fob.getSelectSalutationPassengerOne());
		clickOnElement(fob.getSelectSalutationPassengerOneDrop());
	}

	@And("user enter the valid {string} in the passenger one firstname field for oneway")
	public void user_enter_the_valid_in_the_passenger_one_firstname_field_for_oneway(String string) {
		passInputValue(fob.getPassengerOneFirstNameOne(), string);
	}

	@And("user enter the valid {string} in the passenger one Lastname field for oneway")
	public void user_enter_the_valid_in_the_passenger_one_lastname_field_for_oneway(String string) {
		passInputValue(fob.getPassengerOneLastNameOne(), string);
	}

	@And("user enter the valid {string} in the passenger one PhoneNunber field for oneway")
	public void user_enter_the_valid_in_the_passenger_one_phone_nunber_field_for_oneway(String string) {
		passInputValue(fob.getPassengerOnePhoneNumberOne(), string);
	}

	@And("user select the valid passenger two salutation in the salutation field for oneway")
	public void user_select_the_valid_passenger_two_salutation_in_the_salutation_field_for_oneway() {
		clickOnElement(fob.getPassengerTwoDropArrow());
		clickOnElement(fob.getSelectSalutationPassengerTwo());
		clickOnElement(fob.getSelectSalutationPassengerTwoDrop());

	}

	@And("user enter the valid {string} in the passenger two firstname field for oneway")
	public void user_enter_the_valid_in_the_passenger_two_firstname_field_for_oneway(String string) {
		passInputValue(fob.getPassengerOneFirstNameTwo(), string);
		
	}

	@And("user enter the valid {string} in the passenger two Lastname field for oneway")
	public void user_enter_the_valid_in_the_passenger_two_lastname_field_for_oneway(String string) {
		passInputValue(fob.getPassengerOneLastNameTwo(), string);
	}

	@And("user enter the valid {string} in the passenger two PhoneNunber field for oneway")
	public void user_enter_the_valid_in_the_passenger_two_phone_nunber_field_for_oneway(String string) {
		passInputValue(fob.getPassengerOnePhoneNumberTwo(), string);

	}

	@And("user click the continue button for oneway trip")
	public void user_click_the_continue_button_for_oneway_trip() throws InterruptedException {
		sleep(5000);
		clickOnElement(fob.getPaymentContinueButton());
	}

	@Then("user should get a Trip Summary message on webpage and click the homepage button for oneway")
	public void user_should_get_a_trip_summary_message_on_webpage_and_click_the_homepage_button_for_oneway() throws InterruptedException {
		sleep(10000);
		clickOnElement(fob.getHomePage());
	}

}
