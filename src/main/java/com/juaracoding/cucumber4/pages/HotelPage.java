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

public class HotelPage {

	private WebDriver driver;
	
	public HotelPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//*[@title='home']")
List<WebElement>menu;

@FindBy(id = "cookie_stop")
WebElement btnCookie;

@FindBy(css = "#fadein > span > span > span.select2-search.select2-search--dropdown > input")
WebElement dropDown_city;

@FindBy(id = "select2-hotels_city-container")
WebElement city;

@FindBy(id = "checkin")
WebElement checkin;

@FindBy(id = "checkout")
WebElement checkout;

@FindBy(xpath = "//*[@class=\"dropdown-toggle dropdown-btn travellers waves-effect\"]")
WebElement travel;

@FindBy(id = "rooms")
WebElement room;

@FindBy(id = "adults")
WebElement adult;

@FindBy(id = "childs")
WebElement child;

@FindBy(xpath = "//*[@id='nationality']/option")
List<WebElement>national;

@FindBy(id = "submit")
WebElement search;

@FindBy(xpath = "//*[@class='ladda-label']")
List<WebElement>details;

//@FindBy(css = "#oasis\\ beach\\ tower > div > div.card-body.p-0 > div > div.col-4.p-3 > div > a > span.ladda-label")
//WebElement details;

@FindBy(xpath = "//*[@id='single-content-nav']/ul/li[2]/a")
WebElement pilihRoom;

@FindBy(xpath = "//*[@id='availability']/div[2]/div[1]/div[2]/div/div[2]/form/div/div[3]/div/select")
List<WebElement>pilihNomorRoom;

@FindBy(xpath = "//*[@id='availability']/div[2]/div[1]/div[2]/div/div[2]/form/div/div[3]/div/select")
WebElement klikNomorRoom;

@FindBy(xpath = "//*[@id='availability']/div[2]/div[1]/div[2]/div/div[2]/form/div/div[4]/div/div/button/span[1]")
WebElement bookRoom;

//@FindBy(id="firstname")
//WebElement firstname;
//
//@FindBy(id="lastname")
//WebElement lastname;
//
//@FindBy(id="email")
//WebElement Email;
//
//@FindBy(id="phone")
//WebElement PhoneNumber;
//
//@FindBy(id="address")
//WebElement Address;

@FindBy(xpath = "//*[@name='title_1']")
WebElement dropdowntitle_traveler;

@FindBy(xpath = "//*[@name='title_1']")
List<WebElement>title_traveler;

@FindBy(xpath = "//*[@name='firstname_1']")
WebElement firstname1;

@FindBy(xpath = "//*[@name='lastname_1']")
WebElement lastname1;

@FindBy(css = "#myTab > div.col-md-4.mb-1.gateway_wallet-balance > div")
WebElement payment;

@FindBy(css = "#myTab > div.col-md-4.mb-1.gateway_setmpos > div")
WebElement pilihpayment;

@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div:nth-child(4) > div > div > div > label")
WebElement agree;

@FindBy(id = "booking")
WebElement book;

@FindBy(css = "#fadein > section.payment-area.section-bg.section-padding.pt-4 > div > div > div > div > div.form-box.payment-received-wrap.mb-0 > div.form-title-wrap > h3 > span > strong")
WebElement txtReservationNumber;

//@FindBy(css = "#fadein > header > div.header-menu-wrapper.padding-right-100px.padding-left-100px > div > div > div > div > div.main-menu-content > nav > ul > li:nth-child(2) > a")
//WebElement menuHotel;
//
//@FindBy(id = "ages2")
//WebElement ageschild;
//
//@FindBy(xpath = "//*[@id='ages2']/option")
//List<WebElement> agechild;
//
//@FindBy(xpath = "//*[@class=\"qtyDec\"]")
//List<WebElement>kurang;
//
//@FindBy(xpath = "//*[@class='qtyInc']")
//List<WebElement>tambahroom;
//
//@FindBy(xpath = "//*[@class='qtyDec']")
//List<WebElement>kurangadult;
//
//@FindBy(xpath = "//*[@class='qtyInc']")
//List<WebElement>tambahadult;
//
//@FindBy(xpath = "//*[@class='qtyDec']")
//List<WebElement>kurangchild;
//@FindBy(xpath = "//*[@class=\"card-meta\"]")
//List<WebElement>pilihHotel;
//
//@FindBy(xpath = "//*[@class=\"card-header default\"]")
//List<WebElement>pilihkamar;

public void menuHotel(int hotel) {
	menu.get(hotel).click();
	tunggu();
}

public void cariHotel(String cit, String rooms, String adults, String childs, int natio) {
	city.click();
	tunggu();
	dropDown_city.sendKeys(cit);
	tunggu();
	dropDown_city.sendKeys(Keys.RETURN);
	checkin.sendKeys(Keys.TAB);
	checkout.sendKeys(Keys.TAB);
	travel.click();
	tunggu();
	room.sendKeys(Keys.chord(Keys.CONTROL+"a"));
	room.sendKeys(rooms);
	tunggu();
	adult.sendKeys(Keys.chord(Keys.CONTROL+"a"));
	adult.sendKeys(adults);
	child.sendKeys(Keys.chord(Keys.CONTROL+"a"));
	child.sendKeys(childs);
	national.get(natio).click();
	search.click();
	
//	checkin.sendKeys(Keys.chord(Keys.CONTROL+"a", ci));
//	checkin.sendKeys(ci);
//	checkin.sendKeys(Keys.ENTER);
//	checkout.sendKeys(Keys.chord(Keys.CONTROL+"a", co));
//	checkout.sendKeys(co);
//	checkout.sendKeys(Keys.ENTER);
//	tambahroom.get(rooms).click();
//	kurangadult.get(adults).click();
//	kurangchild.get(childs).click();
//	agechild.get(ageCh).click();
}

public void pilihHotel(int det,int no) {
	tunggu();
	details.get(det).click();
	tunggu();
	pilihRoom.click();
	tunggu();
	klikNomorRoom.click();
	List<Keys> klikNomorRoom = new ArrayList<Keys>();
	for(int i=0; i<no; i++) {
		klikNomorRoom.add(Keys.DOWN);
	}
	klikNomorRoom.add(Keys.ENTER);
	CharSequence[] cs = klikNomorRoom.toArray(new CharSequence[klikNomorRoom.size()]);
	Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	bookRoom.click();
}

public void dataPenginap(int title, String fn1, String ln1) {
//	firstname.sendKeys(fn);
//	lastname.sendKeys(ln);
//	Email.sendKeys(email);
//	PhoneNumber.sendKeys(phon);
//	Address.sendKeys(dress);
	JavascriptExecutor je = (JavascriptExecutor)driver;
	je.executeScript("arguments[0].scrollIntoView(true);",firstname1);
	dropdowntitle_traveler.click();
	List<Keys> title_traveler = new ArrayList<Keys>();
	for(int i=0; i<title; i++) {
		title_traveler.add(Keys.DOWN);
	}
	title_traveler.add(Keys.ENTER);
	CharSequence[] cs = title_traveler.toArray(new CharSequence[title_traveler.size()]);
	Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	firstname1.sendKeys(fn1);
	lastname1.sendKeys(ln1);
	payment.click();
	JavascriptExecutor je1 = (JavascriptExecutor)driver;
	je1.executeScript("arguments[0].scrollIntoView(true);",pilihpayment);
	agree.click();
	JavascriptExecutor je2 = (JavascriptExecutor)driver;
	je2.executeScript("arguments[0].scrollIntoView(true);",agree);
	book.click();
}

public String getTxtTitleBookingHotelPage() {
	return driver.getTitle();
}

public String getTxtReservationNumber() {
	tunggu();
	return txtReservationNumber.getText();
}

public void tunggu() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
