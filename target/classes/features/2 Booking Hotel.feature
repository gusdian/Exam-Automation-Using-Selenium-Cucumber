Feature: Menu Booking Hotel
	Scenario: Booking Hotel pada PHP Travel
		When Customer klik menu Hotel
			And Customer mencari hotel
			And Customer memilih hotel
			And Customer mengisi data diri
		Then Customer berhasil booking hotel