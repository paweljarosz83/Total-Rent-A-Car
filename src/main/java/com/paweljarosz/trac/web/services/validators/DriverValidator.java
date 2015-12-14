package com.paweljarosz.trac.web.services.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.paweljarosz.trac.data.entities.driver.Driver;

public class DriverValidator implements Validator{

	private static final int MIN_LENGTH = 1;
	@Override
	public boolean supports(Class<?> clazz) {
		return Driver.class.equals(clazz);
	}
	private boolean checkType(Driver c){
		return false;
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Driver driver = (Driver)obj;

		if (driver.getName().length() < MIN_LENGTH) {
			errors.rejectValue("name", "driver.name", "");
		}
		if (driver.getSurname().length() < MIN_LENGTH) {
			errors.rejectValue("surname", "driver.surname", "");
		}
		if (driver.getPersonalIdentificationNumber().length() < MIN_LENGTH) {
			errors.rejectValue("personalIdentificationNumber", "driver.personalIdentificationNumber", "");
		}
		//address
		if (driver.getAddress().getStreet().length() < MIN_LENGTH) {
			errors.rejectValue("address.street", "driver.address.street", "");
		}
		if (driver.getAddress().getNumber().length() < MIN_LENGTH) {
			errors.rejectValue("address.number", "driver.address.number", "");
		}
		if (driver.getAddress().getCity().length() < MIN_LENGTH) {
			errors.rejectValue("address.city", "driver.address.city", "");
		}
		if (driver.getAddress().getPost().length() < MIN_LENGTH) {
			errors.rejectValue("address.post", "driver.address.post", "");
		}
		
		if (driver.getLicence().getNumber().length() < MIN_LENGTH) {
			errors.rejectValue("licence.number", "driver.licence.number", "");
		}
		if (driver.getLicence().getCategory().length() < MIN_LENGTH) {
			errors.rejectValue("licence.category", "driver.licence.category", "");
		}
	}
}
