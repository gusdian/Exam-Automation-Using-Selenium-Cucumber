package com.juaracoding.cucumber4.utlis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${user}")
	private String userName;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${hotel}")
	private int hotel;
	
	@Value("${cit}")
	private String cit;
	
	@Value("${rooms}")
	private String rooms;
	
	@Value("${adults}")
	private String adults;
	
	@Value("${childs}")
	private String childs;
	
	@Value("${natio}")
	private int natio; 

	@Value("${det}")
	private int det;
	
	@Value("${no}")
	private int no; 

//	@Value("${addFirstName}")
//	private String addFirstName;
//		
//	@Value("${addLastName}")
//	private String addLastName;
//	
//	@Value("${addEmail}")
//	private String addEmail;
//		
//	@Value("${addPhone}")
//	private String addPhone;
//	
//	@Value("${addAddress}")
//	private String addAddress;
		
	@Value("${title}")
	private int title;
	
	@Value("${addFirstName1}")
	private String addFirstName1;
		
	@Value("${addLastName1}")
	private String addLastName1;
	
	@Value("${txtPageTitleBooking}")
	private String txtPageTitleBooking;
	
	@Value("${txtPageTitleBookingHotel}")
	private String txtPageTitleBookingHotel;

	@Value("${flight}")
	private int flight;
	
	@Value("${reservationNumber}")
	private String reservationNumber;
	
	@Value("${reservationNumberFlight}")
	private String reservationNumberFlight;
	
	@Value("${txtPageTitleBookingFlight}")
	private String txtPageTitleBookingFlight;
	
	@Value("${bandara_from}")
	private String bandara_from;
	
	@Value("${bandara_destination}")
	private String bandara_destination;
	
	@Value("${date}")
	private String date;
	
	@Value("${pilih}")
	private String pilih;
	
	@Value("${fn}")
	private String fn;
	
	@Value("${ln}")
	private String ln;
	
	@Value("${passID}")
	private String passID;

	public String getTxtPageTitleBooking() {
		return txtPageTitleBooking;
	}

	public void setTxtPageTitleBooking(String txtPageTitleBooking) {
		this.txtPageTitleBooking = txtPageTitleBooking;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public void setTxtWelcome(String txtWelcome) {
		this.txtWelcome = txtWelcome;
	}
	
	public int getMenu() {
		return hotel;
	}
	
	public void setMenu(int hotel) {
		this.hotel = hotel;
	}

	public String getCity() {
		return cit;
	}

	public void setCity(String cit) {
		this.cit = cit;
	}

	public String getRoom() {
		return rooms;
	}
	
	public void setRoom(String rooms) {
		this.rooms = rooms;
	}
	
	public String getAdult() {
		return adults;
	}
	
	public void setAdult(String adults) {
		this.adults = adults;
	}
	
	public String getChild() {
		return childs;
	}
	
	public void setChild(String childs) {
		this.childs = childs;
	}
		
	public int getNatio() {
		return natio;
	}
	
	public void setNatio(int natio) {
		this.natio = natio;
	}
	
	public int getDet() {
		return det;
	}
	
	public void setDet(int det) {
		this.det = det;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
//	public String getAddFirstName() {
//		return addFirstName;
//	}
//
//	public void setAddFirstName(String addFirstName) {
//		this.addFirstName = addFirstName;
//	}
//	public String getAddLastName() {
//		return addLastName;
//	}
//
//	public void setAddLastName(String addLastName) {
//		this.addLastName = addLastName;
//	}
//	public String getAddEmail() {
//		return addEmail;
//	}
//
//	public void setAddEmail(String addEmail) {
//		this.addEmail = addEmail;
//	}
//	public String getAddPhone() {
//		return addPhone;
//	}
//
//	public void setAddPhone(String addPhone) {
//		this.addPhone = addPhone;
//	}
//	public String getAddAddress() {
//		return addAddress;
//	}
//
//	public void setAddAddress(String addAddress) {
//		this.addAddress = addAddress;
//	}
	
	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public String getAddFirstName1() {
		return addFirstName1;
	}

	public void setAddFirstName1(String addFirstName1) {
		this.addFirstName1 = addFirstName1;
	}
	public String getAddLastName1() {
		return addLastName1;
	}

	public void setAddLastName1(String addLastName1) {
		this.addLastName1 = addLastName1;
	}

	public String getTxtPageTitleBookingHotel() {
		return txtPageTitleBookingHotel;
	}

	public void setTxtPageTitleBookingHotel(String txtPageTitleBookingHotel) {
		this.txtPageTitleBookingHotel = txtPageTitleBookingHotel;
	}

	public int getMenuFlight() {
		return flight;
	}
	
	public void setMenuFlight(int flight) {
		this.flight = flight;
	}
	
	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getReservationNumberFlight() {
		return reservationNumberFlight;
	}

	public void setReservationNumberFlight(String reservationNumberFlight) {
		this.reservationNumberFlight = reservationNumberFlight;
	}

	public String getTxtPageTitleBookingFlight() {
		return txtPageTitleBookingFlight;
	}

	public void setTxtPageTitleBookingFlight(String txtPageTitleBookingFlight) {
		this.txtPageTitleBookingFlight = txtPageTitleBookingFlight;
	}

	public String getBandara_from() {
		return bandara_from;
	}

	public void setBandara_from(String bandara_from) {
		this.bandara_from = bandara_from;
	}

	public String getBandara_destination() {
		return bandara_destination;
	}

	public void setBandara_destination(String bandara_destination) {
		this.bandara_destination = bandara_destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPilih() {
		return pilih;
	}

	public void setPilih(String pilih) {
		this.pilih = pilih;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getPassID() {
		return passID;
	}

	public void setPassID(String passID) {
		this.passID = passID;
	}
	
	
	
}

