package com.juaracoding.cucumber4.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.cucumber4.drivers.DriverSingleton;

public class FlightPage {
	private WebDriver driver;
	
	public FlightPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@title='home']")
	List<WebElement>menuFlight;
	
	@FindBy(id = "cookie_stop")
	WebElement btnCookie;
	
	@FindBy(id = "autocomplete")
	WebElement pilihKeberangkatan;
	
	@FindBy(id = "autocomplete2")
	WebElement pilihDestination;
	
	@FindBy(id = "departure")
	WebElement field_date;
	
	@FindBy(css = "#onereturn > div.col-lg-1.pr-0 > div > div > div > a")
	WebElement passenger;
	
	@FindBy(id = "flights-search")
	WebElement btnSearchFlight;
	
	@FindBy(css = "#data > ul > li:nth-child(1) > div > form > div > div.col-md-2 > div > button")
	WebElement btnBookFlight;
	
	@FindBy(xpath = "//select[@name='title_1']")
	WebElement title;
	
	@FindBy(name = "firstname_1")
	WebElement firstName;
	
	@FindBy(name = "lastname_1")
	WebElement lastName;
	
	@FindBy(xpath = "//select[@name='nationality_1']")
	WebElement nationality;
	
	@FindBy(xpath = "//select[@name='dob_month_1']")
	WebElement dob_month;
	
	@FindBy(xpath = "//select[@name='dob_day_1']")
	WebElement dob_day;
	
	@FindBy(xpath = "//select[@name='dob_year_1']")
	WebElement dob_year;
	
	@FindBy(name = "passport_1")
	WebElement passport_id;
	
	@FindBy(xpath = "//select[@name='passport_issuance_month_1']")
	WebElement passport_issue_month;
	
	@FindBy(xpath = "//select[@name='passport_issuance_day_1']")
	WebElement passport_issue_day;
	
	@FindBy(xpath = "//select[@name='passport_issuance_year_1']")
	WebElement passport_issue_year;
	
	@FindBy(xpath = "//select[@name='passport_month_1']")
	WebElement passport_exp_month;
	
	@FindBy(xpath = "//select[@name='passport_day_1']")
	WebElement passport_exp_day;
	
	@FindBy(xpath = "//select[@name='passport_year_1']")
	WebElement passport_exp_year;
	
	@FindBy(css = "#myTab > div.col-md-4.mb-1.gateway_bank-transfer")
	WebElement paymentBank;
	
	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div:nth-child(4) > div > div > div > label")
	WebElement checkBox_Agree;
	
	@FindBy(id = "booking")
	WebElement btnConfirmBooking;
	
	@FindBy(css = "#fadein > section.payment-area.section-bg.section-padding.pt-4 > div > div > div > div > div.form-box.payment-received-wrap.mb-0 > div.form-title-wrap > h3 > span > strong")
	WebElement txtReservationNumberFlight;
	
	
	
	public void goToMenuFlight(int flight) {
		menuFlight.get(flight).click();
		tunggu();
	}
	
	public void findFlight(String bandara_from, String bandara_destination, String date) {
		
		tunggu();
		pilihKeberangkatan.click();
		pilihKeberangkatan.sendKeys(bandara_from);
		tunggu();
		pilihKeberangkatan.sendKeys(Keys.ARROW_DOWN);
		pilihKeberangkatan.sendKeys(Keys.ENTER);
		
		pilihDestination.click();
		pilihDestination.sendKeys(bandara_destination);
		tunggu();
		pilihDestination.sendKeys(Keys.ARROW_DOWN);
		pilihDestination.sendKeys(Keys.ENTER);
		
		field_date.sendKeys(Keys.chord(Keys.CONTROL+"a", date));
		field_date.sendKeys(date);
		field_date.sendKeys(Keys.RETURN);
		
		tunggu();
		
		passenger.sendKeys(Keys.TAB);
		
		tunggu();
		
		btnSearchFlight.click();
		
	}
	
	public void pickFlight() {
		
		tunggu();
		btnBookFlight.click();
	}
	
	public void dataDiri(int pilih, String fn, String ln, String passID) {
		
		title.click();
		List<Keys> title = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			title.add(Keys.DOWN);
		}
		title.add(Keys.ENTER);
		CharSequence[] cs = title.toArray(new CharSequence[title.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		
		nationality.click();
		List<Keys> nationality = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			nationality.add(Keys.DOWN);
		}
		nationality.add(Keys.ENTER);
		CharSequence[] cs1 = nationality.toArray(new CharSequence[nationality.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
		
		tunggu();
		
		dob_month.click();
		List<Keys> dob_month = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			dob_month.add(Keys.DOWN);
		}
		dob_month.add(Keys.ENTER);
		CharSequence[] cs2 = dob_month.toArray(new CharSequence[dob_month.size()]);
		Actions keyDown2 = new Actions(driver); keyDown2.sendKeys(Keys.chord(cs2)).perform();
		
		tunggu();
		
		dob_day.click();
		List<Keys> dob_day = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			dob_day.add(Keys.DOWN);
		}
		dob_day.add(Keys.ENTER);
		CharSequence[] cs3 = dob_day.toArray(new CharSequence[dob_day.size()]);
		Actions keyDown3 = new Actions(driver); keyDown3.sendKeys(Keys.chord(cs3)).perform();
		
		dob_year.click();
		List<Keys> dob_year = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			dob_year.add(Keys.DOWN);
		}
		dob_year.add(Keys.ENTER);
		CharSequence[] cs4 = dob_year.toArray(new CharSequence[dob_year.size()]);
		Actions keyDown4 = new Actions(driver); keyDown4.sendKeys(Keys.chord(cs4)).perform();
		
		tunggu();
		
		passport_id.sendKeys(passID);
		
		tunggu();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		
		passport_issue_month.click();
		List<Keys> passport_issue_month = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			passport_issue_month.add(Keys.DOWN);
		}
		passport_issue_month.add(Keys.ENTER);
		CharSequence[] cs5 = passport_issue_month.toArray(new CharSequence[passport_issue_month.size()]);
		Actions keyDown5 = new Actions(driver); keyDown5.sendKeys(Keys.chord(cs5)).perform();
		
		passport_issue_day.click();
		List<Keys> passport_issue_day = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			passport_issue_day.add(Keys.DOWN);
		}
		passport_issue_day.add(Keys.ENTER);
		CharSequence[] cs6 = passport_issue_day.toArray(new CharSequence[passport_issue_day.size()]);
		Actions keyDown6 = new Actions(driver); keyDown6.sendKeys(Keys.chord(cs6)).perform();
		
		passport_issue_year.click();
		List<Keys> passport_issue_year = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			passport_issue_year.add(Keys.DOWN);
		}
		passport_issue_year.add(Keys.ENTER);
		CharSequence[] cs7 = passport_issue_year.toArray(new CharSequence[passport_issue_year.size()]);
		Actions keyDown7 = new Actions(driver); keyDown7.sendKeys(Keys.chord(cs7)).perform();
		
		tunggu();
		
		passport_exp_month.click();
		List<Keys> passport_exp_month = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			passport_exp_month.add(Keys.DOWN);
		}
		passport_exp_month.add(Keys.ENTER);
		CharSequence[] cs8 = passport_exp_month.toArray(new CharSequence[passport_exp_month.size()]);
		Actions keyDown8 = new Actions(driver); keyDown8.sendKeys(Keys.chord(cs8)).perform();
		
		passport_exp_day.click();
		List<Keys> passport_exp_day = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			passport_exp_day.add(Keys.DOWN);
		}
		passport_exp_day.add(Keys.ENTER);
		CharSequence[] cs9 = passport_exp_day.toArray(new CharSequence[passport_exp_day.size()]);
		Actions keyDown9 = new Actions(driver); keyDown9.sendKeys(Keys.chord(cs9)).perform();
		
		passport_exp_year.click();
		List<Keys> passport_exp_year = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			passport_exp_year.add(Keys.DOWN);
		}
		passport_exp_year.add(Keys.ENTER);
		CharSequence[] cs10 = passport_exp_year.toArray(new CharSequence[passport_exp_year.size()]);
		Actions keyDown10 = new Actions(driver); keyDown10.sendKeys(Keys.chord(cs10)).perform();
		
		je.executeScript("window.scrollBy(0, 500)");
		
		tunggu();
		
		paymentBank.click();
		
		je.executeScript("window.scrollBy(0, 500)");
		
		tunggu();
		
		checkBox_Agree.click();
		
		tunggu();
		
		btnConfirmBooking.click();
	}
	
	public String getTxtTitleBookingFlightPage() {
		return driver.getTitle();
	}
	
	public String getTxtReservationNumberFlight() {
		tunggu();
		return txtReservationNumberFlight.getText();
	}
	
	
	public void tunggu() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
