package com.paweljarosz.trac.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paweljarosz.trac.data.entities.rental.Rental;
import com.paweljarosz.trac.data.repositories.RentalRepository;

@Service
public class RentalService {
	
	@Autowired
	private RentalRepository rentalRepository;

	public void saveRental(Rental rental) {
		rentalRepository.save(rental);
		
	}
	
}
