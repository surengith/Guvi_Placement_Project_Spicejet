package com.Pages.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.org.BaseClass;

public class Login extends BaseClass{
	
	public static WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[text()='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//div[text()='Email']")
	private WebElement loginPageEmailButton;
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement loginPageEmail;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement loginPagePassword;
	
	@FindBy (xpath = "//div[@data-testid='login-cta']")
	private WebElement loginPageLoginButton;
	
	@FindBy (xpath = "(//*[name()='path'])[17]")
	private WebElement loginPageCloseButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLoginPageEmailButton() {
		return loginPageEmailButton;
	}

	public void setLoginPageEmailButton(WebElement loginPageEmailButton) {
		this.loginPageEmailButton = loginPageEmailButton;
	}

	public WebElement getLoginPageEmail() {
		return loginPageEmail;
	}

	public void setLoginPageEmail(WebElement loginPageEmail) {
		this.loginPageEmail = loginPageEmail;
	}

	public WebElement getLoginPagePassword() {
		return loginPagePassword;
	}

	public void setLoginPagePassword(WebElement loginPagePassword) {
		this.loginPagePassword = loginPagePassword;
	}

	public WebElement getLoginPageLoginButton() {
		return loginPageLoginButton;
	}

	public void setLoginPageLoginButton(WebElement loginPageLoginButton) {
		this.loginPageLoginButton = loginPageLoginButton;
	}

	public WebElement getLoginPageCloseButton() {
		return loginPageCloseButton;
	}

	public void setLoginPageCloseButton(WebElement loginPageCloseButton) {
		this.loginPageCloseButton = loginPageCloseButton;
	}

}
