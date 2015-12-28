package com.paweljarosz.trac.web.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.paweljarosz.trac.data.daos.driver.DriverDao;
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
}
