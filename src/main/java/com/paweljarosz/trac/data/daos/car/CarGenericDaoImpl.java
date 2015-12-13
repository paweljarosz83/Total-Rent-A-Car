package com.paweljarosz.trac.data.daos.car;

import org.springframework.stereotype.Component;

import com.paweljarosz.trac.data.daos.base.generic.BaseGenericDaoImpl;
import com.paweljarosz.trac.data.entities.car.Car;

@Component
public class CarGenericDaoImpl extends BaseGenericDaoImpl<Car,Long> implements CarGenericDao{
	
	@Override
	public Car createCar(String color) {

		Car c = new Car();
		c.setBody("booooooody");
		em.persist(c);
		return c;
	}
}
