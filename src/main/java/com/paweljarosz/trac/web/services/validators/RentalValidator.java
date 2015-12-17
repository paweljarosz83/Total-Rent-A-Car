package com.paweljarosz.trac.web.services.validators;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.rental.Rental;

public class RentalValidator implements Validator{

	private static final int MIN_LENGTH = 1;
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Rental.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Rental rental = (Rental)obj;
		
		if (rental.getFrom().length() < MIN_LENGTH || !isValidFromDate(rental)) {
			errors.rejectValue("from", "rental.from", "");
		}
		if (rental.getFrom().length() < MIN_LENGTH || !isValidToDate(rental)) {
			errors.rejectValue("to", "rental.to", "");
		}
		if (rental.getFrom().length() < MIN_LENGTH) {
			errors.rejectValue("returnPoint", "rental.returnPoint", "");
		}
	}

	private boolean isValidFromDate(Rental rental) {
		Date date;
		try {
			date = dateFormat.parse(rental.getFrom());
			rental.setPickupDate(date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	private boolean isValidToDate(Rental rental) {
		Date date;
		try {
			date = dateFormat.parse(rental.getTo());
			rental.setReturnDate(date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
