package com.juaracoding.cucumber4.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber4.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber4.drivers.DriverSingleton;
import com.juaracoding.cucumber4.pages.FlightPage;
import com.juaracoding.cucumber4.pages.HotelPage;
import com.juaracoding.cucumber4.pages.LoginPage;
import com.juaracoding.cucumber4.utlis.ConfigurationProperties;
import com.juaracoding.cucumber4.utlis.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class TestLogin {

	private WebDriver driver;
	private LoginPage loginPage;
	private HotelPage hotelPage;
	private FlightPage flightPage;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		hotelPage = new HotelPage();
		flightPage = new FlightPage();
	}
	
	@After
	public void closeBrowser() {
	//	driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer klik login button")
	public void customer_klik_login_button() {
		loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		//refresh
		driver.navigate().refresh();
		tunggu();
		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
	}
	
	@When ("Customer klik menu Hotel")
	public void customer_klik_menu_hotel() {
		hotelPage.menuHotel(configurationProperties.getMenu());
	}
	
	@And ("Customer mencari hotel")
	public void customer_mencari_hotel() {
		hotelPage.cariHotel(configurationProperties.getCity(), configurationProperties.getRoom(), configurationProperties.getAdult(),configurationProperties.getChild(), configurationProperties.getNatio());
	}
	
	@And ("Customer memilih hotel")
	public void customer_memilih_hotel() {
		hotelPage.pilihHotel(configurationProperties.getDet(), configurationProperties.getNo());
	}
	
	@And ("Customer mengisi data diri")
	public void customer_mengisi_data_diri() {
		hotelPage.dataPenginap(configurationProperties.getTitle(), configurationProperties.getAddFirstName1(), configurationProperties.getAddLastName1());
	}
	
	
	@Then ("Customer berhasil booking hotel")
	public void customer_berhasil_booking_hotel() {
		assertEquals(configurationProperties.getTxtPageTitleBookingHotel(), hotelPage.getTxtTitleBookingHotelPage());
		assertEquals(configurationProperties.getReservationNumber(), hotelPage.getTxtReservationNumber());
	}
	
		@When("Customer klik menu Flight")
		public void customer_klik_menu_flight() {
			flightPage.goToMenuFlight(configurationProperties.getMenuFlight());
			
		}
		
		@And("Customer mencari flight")
		public void customer_mencari_flight() {
			flightPage.findFlight(configurationProperties.getBandara_from(), configurationProperties.getBandara_destination(), configurationProperties.getDate());
		}
		
		@And("Customer memilih flight")
		public void customer_memilih_flight() {
			flightPage.pickFlight();
		}
		
		@And("Customer mengisi data diri flight")
		public void customer_mengisi_data_diri_flight() {
			flightPage.dataDiri(1, configurationProperties.getFn(), configurationProperties.getLn(), configurationProperties.getPassID());
		}
		
		@Then("Customer berhasil booking flight")
		public void customer_berhasil_booking_flight() {
			assertEquals(configurationProperties.getTxtPageTitleBookingFlight(), flightPage.getTxtTitleBookingFlightPage());
			assertEquals(configurationProperties.getReservationNumberFlight(), configurationProperties.getReservationNumberFlight());
		}
		
		public void tunggu() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}


