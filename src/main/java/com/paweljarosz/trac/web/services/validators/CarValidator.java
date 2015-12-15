package com.paweljarosz.trac.web.services.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.web.services.DriverService;


public class CarValidator implements Validator{


	
	private static final int MIN_LENGTH = 1;
	private static final int MAX_LENGTH = 999999;
	@Override
	public boolean supports(Class<?> clazz) {
		return Car.class.equals(clazz);
	}
	private boolean checkType(Car c){
		return false;
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Car car = (Car)obj;

		try {
			if (car.getModel().length() < MIN_LENGTH) {
				errors.rejectValue("model", "car.model", "");
			}
			if (car.getMake().length() < MIN_LENGTH) {
				errors.rejectValue("make", "car.make", "");
			}
			if (car.getRegistration().length() < MIN_LENGTH) {
				errors.rejectValue("registration", "car.registration", "");
			}
			if (car.getBody() == null || car.getBody().length() < MIN_LENGTH) {
				errors.rejectValue("body", "car.body", "");
			}
			if (car.getColor().length() < MIN_LENGTH) {
				errors.rejectValue("color", "car.color", "");
			}
			if (car.getKilometers() == null || car.getKilometers() < MIN_LENGTH || car.getKilometers() > MAX_LENGTH) {
				errors.rejectValue("kilometers", "car.kilometers", "");
			}
			if (car.getPrice() == null || car.getPrice() < MIN_LENGTH) {
				errors.rejectValue("price", "car.price", "");
			}
			if (car.getTrunk() == null || car.getTrunk() < MIN_LENGTH) {
				errors.rejectValue("trunk", "car.trunk", "");
			}
			//engine
			if (car.getEngine().getType() == null || car.getEngine().getType().length() < MIN_LENGTH) {
				errors.rejectValue("engine.type", "car.engine.type", "");
			}
			if (car.getEngine().getCapacity() == null || car.getEngine().getCapacity() < MIN_LENGTH) {
				errors.rejectValue("engine.capacity", "car.engine.capacity", "");
			}
			if (car.getEngine().getPower() == null || car.getEngine().getPower() < MIN_LENGTH) {
				errors.rejectValue("engine.power", "car.engine.power", "");
			} 
		} catch (Exception e) {
			//LOG
		} 
	}
}
