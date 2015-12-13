package com.paweljarosz.trac.web.services.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.paweljarosz.trac.data.entities.car.Car;

public class CarValidator implements Validator{

	private static final int MIN_LENGTH = 1;
	@Override
	public boolean supports(Class<?> clazz) {
		return Car.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Car car = (Car)obj;
		if(car.getModel().length()<MIN_LENGTH){
			errors.rejectValue("model","car.model","");
		}
		if(car.getMake().length()<MIN_LENGTH){
			errors.rejectValue("make","car.make","");
		}
		if(car.getRegistration().length()<MIN_LENGTH){
			errors.rejectValue("registration","car.registration","");
		}
		if(car.getPower()==null || car.getPower()<MIN_LENGTH){
			errors.rejectValue("power","car.power","");
		}
		if(car.getTrunk()==null || car.getTrunk()<MIN_LENGTH){
			errors.rejectValue("trunk","car.trunk","");
		}
		if(car.getBody()==null || car.getBody().length()<MIN_LENGTH){
			errors.rejectValue("body","car.body","");
		}
		if(car.getColor().length()<MIN_LENGTH){
			errors.rejectValue("color","car.color","");
		}
		if(car.getKilometers()==null || car.getKilometers()<MIN_LENGTH){
			errors.rejectValue("kilometers","car.kilometers","");
		}
		if(car.getPrice()==null || car.getPrice()<MIN_LENGTH){
			errors.rejectValue("price","car.price","");
		}
	}
}
