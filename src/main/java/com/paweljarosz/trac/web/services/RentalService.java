package com.paweljarosz.trac.web.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paweljarosz.trac.data.daos.rental.RentalDao;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.data.entities.rental.Rental;
import com.paweljarosz.trac.data.repositories.RentalRepository;

@Service
public class RentalService {
	
	@Autowired
	private RentalDao dao;
	
	@Autowired
	private DriverService driverService;
	
	@Autowired
	private RentalRepository rentalRepository;

	public void saveRental(Rental rental){
		String[]s = rental.getNameAndSurname().split(" ");
		Driver d = driverService.findDriverByNameAndSurname(s[0],s[1]);
		rental.setDriver(d);
		rentalRepository.save(rental);
	}
	
	public List<Rental> getRentals() {
		return rentalRepository.findAll();
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	public RentalRepository getRentalRepository() {
		return rentalRepository;
	}

	public void setRentalRepository(RentalRepository rentalRepository) {
		this.rentalRepository = rentalRepository;
	}
	
}
