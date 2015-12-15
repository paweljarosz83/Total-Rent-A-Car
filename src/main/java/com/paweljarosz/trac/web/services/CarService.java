package com.paweljarosz.trac.web.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.paweljarosz.trac.data.daos.car.CarDao;
import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.driver.Driver;

@EnableTransactionManagement
@Service
public class CarService {
	
	@Autowired
	private CarDao carDao;
	
	public void saveCar(Car car){
		carDao.addCar(car);
	}
	
	public List<Car> getCars() {
		return carDao.getCars();
	}
}
