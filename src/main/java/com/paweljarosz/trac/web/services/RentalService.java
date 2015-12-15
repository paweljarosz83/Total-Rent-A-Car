package com.paweljarosz.trac.web.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paweljarosz.trac.data.daos.rental.RentalDTO;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.data.entities.rental.Rental;
import com.paweljarosz.trac.data.repositories.RentalRepository;

@Service
public class RentalService {
	
	@Autowired
	private DriverService driverService;
	
	@Autowired
	private RentalRepository rentalRepository;

	public void saveRental(Rental rental){
		System.out.println(rental.getNameAndSurname());
		String[]s = rental.getNameAndSurname().split(" ");
		Driver d = driverService.findDriverByNameAndSurname(s[0],s[1]);
		rental.setDriver(d);
		rentalRepository.save(rental);
	}
}
