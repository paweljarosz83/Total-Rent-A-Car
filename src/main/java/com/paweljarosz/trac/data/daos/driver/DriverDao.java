package com.paweljarosz.trac.data.daos.driver;

import java.util.List;
import com.paweljarosz.trac.data.daos.base.BaseDao;
import com.paweljarosz.trac.data.entities.driver.Driver;

public interface DriverDao extends BaseDao {

	public List<Driver>getDrivers();

	public Driver findDriverByNameAndSurname(String name, String surname);
}
