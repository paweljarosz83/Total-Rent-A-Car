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
	}
}
