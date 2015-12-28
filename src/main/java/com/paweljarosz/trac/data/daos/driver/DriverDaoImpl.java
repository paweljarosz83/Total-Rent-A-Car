package com.paweljarosz.trac.data.daos.driver;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.paweljarosz.trac.data.daos.base.BaseDaoImpl;
import com.paweljarosz.trac.data.entities.driver.Driver;

@Repository
public class DriverDaoImpl extends BaseDaoImpl implements DriverDao{

	@Override
	public List<Driver> getDrivers() {
		TypedQuery<Driver>query = em.createQuery("SELECT d FROM Driver d",Driver.class);
		return query.getResultList();
	}

	@Override
	public Driver findDriverByNameAndSurname(String name,String surname) {
		TypedQuery<Driver>query = em.createQuery("SELECT d FROM Driver d WHERE d.name= (:name) AND d.surname= (:surname)",Driver.class);
		query.setParameter("name", name);
		query.setParameter("surname", surname);
		return query.getSingleResult();
	}

	@Override
	public Driver findDriverByPersonalIdentificationNumber(String personalIdentificationNumber) {
		TypedQuery<Driver>query = em.createQuery("SELECT d FROM Driver d WHERE d.personalIdentificationNumber= (:personalIdentificationNumber)",Driver.class);
		query.setParameter("personalIdentificationNumber", personalIdentificationNumber);
		return query.getSingleResult();
	}

	@Override
	public void updateDriver(Driver newDriver, Driver existingDriver) {
		existingDriver.setName(newDriver.getName());
		existingDriver.setSurname(newDriver.getSurname());
		existingDriver.setAddress(newDriver.getAddress());
		existingDriver.setLicence(newDriver.getLicence());
		em.merge(existingDriver);	
	}
}
