package com.paweljarosz.trac.data.daos.car;

import com.paweljarosz.trac.data.daos.base.generic.BaseGenericDao;
import com.paweljarosz.trac.data.entities.car.Car;

public interface CarGenericDao extends BaseGenericDao<Car,Long>{

	Car createCar(String color);
}
