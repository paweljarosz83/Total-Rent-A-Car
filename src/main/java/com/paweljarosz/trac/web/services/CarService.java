package com.paweljarosz.trac.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.paweljarosz.trac.data.daos.car.CarDao;
import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.repositories.CarRepository;

@EnableTransactionManagement
@Service
public class CarService {
	
	@Autowired
	private CarDao carDao;
	
	@Autowired
	private CarRepository carRepository;
	
	public void saveCar(Car car){
		carDao.addCar(car);
	}
	
	public List<Car> getCars() {
		return carDao.getCars();
	}

	public Car findCarByRegistration(String registration) {
		try {
			return carDao.findCarByRegistration(registration);
		} catch (Exception e) {
			//log error
			return null;
		}
	}

	public void mergeCar(Car car, Car existingCar) {
		carDao.mergeCar(car,existingCar);
	}

	public Car findCarById(Long id) {
		return this.carRepository.findOne(id);
	}
}
