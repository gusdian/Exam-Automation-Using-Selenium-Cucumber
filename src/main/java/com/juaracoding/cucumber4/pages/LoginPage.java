package com.juaracoding.cucumber4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement inputEmail;
	
	@FindBy(name = "password")
	WebElement inputPassword;	
	
	@FindBy(css = "#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button > span.ladda-label")
	WebElement btnLogin;
	
	@FindBy(id = "cookie_stop")
	WebElement btnGotIt;
	
	@FindBy(className = "author__meta")
	WebElement txtWelcome;
	
	public void submitLogin(String email, String password) {
		btnGotIt.click();
		inputEmail.sendKeys(email);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
}
