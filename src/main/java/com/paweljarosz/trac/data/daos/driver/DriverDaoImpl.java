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
		System.out.println("zapyt driv");
		TypedQuery<Driver>query = em.createQuery("SELECT d FROM Driver d WHERE d.name= (:name) AND d.surname= (:surname)",Driver.class);
		query.setParameter("name", name);
		query.setParameter("surname", surname);
		return query.getSingleResult();
	}

}
