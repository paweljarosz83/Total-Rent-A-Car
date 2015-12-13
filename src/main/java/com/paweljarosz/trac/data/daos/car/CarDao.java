package com.paweljarosz.trac.data.daos.car;

import java.util.List;

import com.paweljarosz.trac.data.daos.base.BaseDao;
import com.paweljarosz.trac.data.entities.car.Car;

public interface CarDao extends BaseDao{

	public void addCar(Car car);
	
	public Car findById(Long id);
	
	public List<Car> getCars();
	
}
