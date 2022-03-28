Feature: Menu Booking Flight
	Scenario: Booking Flight pada PHP Travel
		When Customer klik menu Flight
			And Customer mencari flight
			And Customer memilih flight
			And Customer mengisi data diri flight
		Then Customer berhasil booking flight