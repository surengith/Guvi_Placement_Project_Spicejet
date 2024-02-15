package com.Pages.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.org.BaseClass;

public class FlightRoundTripBooking extends BaseClass {

	public static WebDriver driver;

	public FlightRoundTripBooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[name()='circle'])[3]")
	private WebElement roundTripButton;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement roundTripFromOriginClick;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement roundTripToDestination;

	@FindBy(xpath = "(//div[@data-testid='undefined-calendar-day-29'][normalize-space()='29'])[1]")
	private WebElement roundTripDepartureDatePicker;

	@FindBy(xpath = "(//div[@data-testid='undefined-calendar-day-3'][normalize-space()='3'])[2]")
	private WebElement roundTripReturnDatePicker;

	@FindBy(xpath = "//div[text()='Passengers']")
	private WebElement roundTripPassengers;

	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[18]")
	private WebElement roundTripAdult;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	private WebElement roundTripSearchButton;

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	private WebElement continueButtonRound;

	@FindBy(xpath = "(//div[text()='Mr'][text()='Mr'])[1]")
	private WebElement selectSalutationBookingRound;

	@FindBy(xpath = "(//div[text()='Mr'][text()='Mr'])[2]")
	private WebElement selectSalutationBookingDropRound;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement contactDetailsFirstNameRound;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement contactDetailsLastNameRound;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement contactDetailsPhoneNumberRound;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement contactDetailsEmailRound;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement contactDetailsTownRound;

	@FindBy(xpath = "(//div[text()='Mr'])[2]")
	private WebElement selectSalutationPassengerOneRound;

	@FindBy(xpath = "(//div[text()='Mr'])[3]")
	private WebElement selectSalutationPassengerOneDropRound;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement PassengerOneFirstNameOneRound;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement PassengerOneLastNameOneRound;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement PassengerOnePhoneNumberOneRound;

	@FindBy(xpath = "//div[text()='Next']")
	private WebElement passengerTwoDropArrowRound;

	@FindBy(xpath = "(//div[text()='Mr'])[2]")
	private WebElement selectSalutationPassengerTwoRound;

	@FindBy(xpath = "(//div[text()='Mr'])[3]")
	private WebElement selectSalutationPassengerTwoDropRound;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement PassengerOneFirstNameTwoRound;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement PassengerOneLastNameTwoRound;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement PassengerOnePhoneNumberTwoRound;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	private WebElement paymentContinueButtonRound;
	
	@FindBy(xpath = "//img[@src='https://www.spicejet.com/public/v1.svg']")
	private WebElement homePageRound;


	public WebElement getRoundTripButton() {
		return roundTripButton;
	}

	public void setRoundTripButton(WebElement roundTripButton) {
		this.roundTripButton = roundTripButton;
	}

	public WebElement getRoundTripFromOriginClick() {
		return roundTripFromOriginClick;
	}

	public void setRoundTripFromOriginClick(WebElement roundTripFromOriginClick) {
		this.roundTripFromOriginClick = roundTripFromOriginClick;
	}

	public WebElement getRoundTripToDestination() {
		return roundTripToDestination;
	}

	public void setRoundTripToDestination(WebElement roundTripToDestination) {
		this.roundTripToDestination = roundTripToDestination;
	}

	public WebElement getRoundTripDepartureDatePicker() {
		return roundTripDepartureDatePicker;
	}

	public void setRoundTripDepartureDatePicker(WebElement roundTripDepartureDatePicker) {
		this.roundTripDepartureDatePicker = roundTripDepartureDatePicker;
	}

	public WebElement getRoundTripReturnDatePicker() {
		return roundTripReturnDatePicker;
	}

	public void setRoundTripReturnDatePicker(WebElement roundTripReturnDatePicker) {
		this.roundTripReturnDatePicker = roundTripReturnDatePicker;
	}

	public WebElement getRoundTripPassengers() {
		return roundTripPassengers;
	}

	public void setRoundTripPassengers(WebElement roundTripPassengers) {
		this.roundTripPassengers = roundTripPassengers;
	}

	public WebElement getRoundTripAdult() {
		return roundTripAdult;
	}

	public void setRoundTripAdult(WebElement roundTripAdult) {
		this.roundTripAdult = roundTripAdult;
	}

	public WebElement getRoundTripSearchButton() {
		return roundTripSearchButton;
	}

	public void setRoundTripSearchButton(WebElement roundTripSearchButton) {
		this.roundTripSearchButton = roundTripSearchButton;
	}

	public WebElement getContinueButtonRound() {
		return continueButtonRound;
	}

	public void setContinueButtonRound(WebElement continueButtonRound) {
		this.continueButtonRound = continueButtonRound;
	}

	public WebElement getSelectSalutationBookingRound() {
		return selectSalutationBookingRound;
	}

	public void setSelectSalutationBookingRound(WebElement selectSalutationBookingRound) {
		this.selectSalutationBookingRound = selectSalutationBookingRound;
	}

	public WebElement getSelectSalutationBookingDropRound() {
		return selectSalutationBookingDropRound;
	}

	public void setSelectSalutationBookingDropRound(WebElement selectSalutationBookingDropRound) {
		this.selectSalutationBookingDropRound = selectSalutationBookingDropRound;
	}

	public WebElement getContactDetailsFirstNameRound() {
		return contactDetailsFirstNameRound;
	}

	public void setContactDetailsFirstNameRound(WebElement contactDetailsFirstNameRound) {
		this.contactDetailsFirstNameRound = contactDetailsFirstNameRound;
	}

	public WebElement getContactDetailsLastNameRound() {
		return contactDetailsLastNameRound;
	}

	public void setContactDetailsLastNameRound(WebElement contactDetailsLastNameRound) {
		this.contactDetailsLastNameRound = contactDetailsLastNameRound;
	}

	public WebElement getContactDetailsPhoneNumberRound() {
		return contactDetailsPhoneNumberRound;
	}

	public void setContactDetailsPhoneNumberRound(WebElement contactDetailsPhoneNumberRound) {
		this.contactDetailsPhoneNumberRound = contactDetailsPhoneNumberRound;
	}

	public WebElement getContactDetailsEmailRound() {
		return contactDetailsEmailRound;
	}

	public void setContactDetailsEmailRound(WebElement contactDetailsEmailRound) {
		this.contactDetailsEmailRound = contactDetailsEmailRound;
	}

	public WebElement getContactDetailsTownRound() {
		return contactDetailsTownRound;
	}

	public void setContactDetailsTownRound(WebElement contactDetailsTownRound) {
		this.contactDetailsTownRound = contactDetailsTownRound;
	}

	public WebElement getSelectSalutationPassengerOneRound() {
		return selectSalutationPassengerOneRound;
	}

	public void setSelectSalutationPassengerOneRound(WebElement selectSalutationPassengerOneRound) {
		this.selectSalutationPassengerOneRound = selectSalutationPassengerOneRound;
	}

	public WebElement getSelectSalutationPassengerOneDropRound() {
		return selectSalutationPassengerOneDropRound;
	}

	public void setSelectSalutationPassengerOneDropRound(WebElement selectSalutationPassengerOneDropRound) {
		this.selectSalutationPassengerOneDropRound = selectSalutationPassengerOneDropRound;
	}

	public WebElement getPassengerOneFirstNameOneRound() {
		return PassengerOneFirstNameOneRound;
	}

	public void setPassengerOneFirstNameOneRound(WebElement passengerOneFirstNameOneRound) {
		PassengerOneFirstNameOneRound = passengerOneFirstNameOneRound;
	}

	public WebElement getPassengerOneLastNameOneRound() {
		return PassengerOneLastNameOneRound;
	}

	public void setPassengerOneLastNameOneRound(WebElement passengerOneLastNameOneRound) {
		PassengerOneLastNameOneRound = passengerOneLastNameOneRound;
	}

	public WebElement getPassengerOnePhoneNumberOneRound() {
		return PassengerOnePhoneNumberOneRound;
	}

	public void setPassengerOnePhoneNumberOneRound(WebElement passengerOnePhoneNumberOneRound) {
		PassengerOnePhoneNumberOneRound = passengerOnePhoneNumberOneRound;
	}

	public WebElement getPassengerTwoDropArrowRound() {
		return passengerTwoDropArrowRound;
	}

	public void setPassengerTwoDropArrowRound(WebElement passengerTwoDropArrowRound) {
		this.passengerTwoDropArrowRound = passengerTwoDropArrowRound;
	}

	public WebElement getSelectSalutationPassengerTwoRound() {
		return selectSalutationPassengerTwoRound;
	}

	public void setSelectSalutationPassengerTwoRound(WebElement selectSalutationPassengerTwoRound) {
		this.selectSalutationPassengerTwoRound = selectSalutationPassengerTwoRound;
	}

	public WebElement getSelectSalutationPassengerTwoDropRound() {
		return selectSalutationPassengerTwoDropRound;
	}

	public void setSelectSalutationPassengerTwoDropRound(WebElement selectSalutationPassengerTwoDropRound) {
		this.selectSalutationPassengerTwoDropRound = selectSalutationPassengerTwoDropRound;
	}

	public WebElement getPassengerOneFirstNameTwoRound() {
		return PassengerOneFirstNameTwoRound;
	}

	public void setPassengerOneFirstNameTwoRound(WebElement passengerOneFirstNameTwoRound) {
		PassengerOneFirstNameTwoRound = passengerOneFirstNameTwoRound;
	}

	public WebElement getPassengerOneLastNameTwoRound() {
		return PassengerOneLastNameTwoRound;
	}

	public void setPassengerOneLastNameTwoRound(WebElement passengerOneLastNameTwoRound) {
		PassengerOneLastNameTwoRound = passengerOneLastNameTwoRound;
	}

	public WebElement getPassengerOnePhoneNumberTwoRound() {
		return PassengerOnePhoneNumberTwoRound;
	}

	public void setPassengerOnePhoneNumberTwoRound(WebElement passengerOnePhoneNumberTwoRound) {
		PassengerOnePhoneNumberTwoRound = passengerOnePhoneNumberTwoRound;
	}

	public WebElement getPaymentContinueButtonRound() {
		return paymentContinueButtonRound;
	}

	public void setPaymentContinueButtonRound(WebElement paymentContinueButtonRound) {
		this.paymentContinueButtonRound = paymentContinueButtonRound;
	}

	public WebElement getHomePageRound() {
		return homePageRound;
	}

	public void setHomePageRound(WebElement homePageRound) {
		this.homePageRound = homePageRound;
	}
	
	

}
