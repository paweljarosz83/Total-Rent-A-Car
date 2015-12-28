package com.paweljarosz.trac.web.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.paweljarosz.trac.data.daos.driver.DriverDao;
import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.data.repositories.DriverRepository;


@Service
public class DriverService {

	@Autowired
	private DriverDao dao;

	@Autowired
	private DriverRepository repository;

	public void saveDriver(@ModelAttribute Driver driver) {
		dao.create(driver);
	}

	public List<Driver> getDrivers() {
		return dao.getDrivers();
	}

	public Driver findOne(Long id){
		return repository.findOne(id);
	}

	public Driver findDriverByNameAndSurname(String name,String surname){
		return dao.findDriverByNameAndSurname(name,surname);
	}

	public Driver findDriverByPersonalIdentificationNumber(String personalIdentificationNumber) {
		return dao.findDriverByPersonalIdentificationNumber(personalIdentificationNumber);
	}

	public void updateDriver(Driver updatedDriver) {
		Driver existingDriver = dao.findDriverByPersonalIdentificationNumber(updatedDriver.getPersonalIdentificationNumber());
		if (existingDriver == null) {
			//log error
		} else {
			existingDriver.setName(updatedDriver.getName());
			existingDriver.setSurname(updatedDriver.getSurname());
			existingDriver.setLicence(updatedDriver.getLicence());
			existingDriver.setAddress(updatedDriver.getAddress());
			dao.update(existingDriver);
		} 
	}
	public boolean hasErrors(Errors errors){
		if(errors.hasFieldErrors("name")){
			return true;
		}
		if(errors.hasFieldErrors("surname")){
			return true;
		}
		if(errors.hasFieldErrors("address.street")){
			return true;
		}
		if(errors.hasFieldErrors("address.number")){
			return true;
		}
		if(errors.hasFieldErrors("address.city")){
			return true;
		}
		if(errors.hasFieldErrors("address.post")){
			return true;
		}
		if(errors.hasFieldErrors("licence.number")){
			return true;
		}
		if(errors.hasFieldErrors("licence.category")){
			return true;
		}
		return false;
	}
}
