package com.paweljarosz.trac.data.daos.car;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.paweljarosz.trac.data.daos.base.BaseDaoImpl;
import com.paweljarosz.trac.data.entities.car.Car;

@Repository
public class CarDaoImpl extends BaseDaoImpl implements CarDao{
	
	@Override
	public void addCar(Car car) {
		em.persist(car);
		//Session session = em.unwrap(Session.class);
	}

	@Override
	public Car findById(Long id) {
		return em.find(Car.class, id);
	}

	@Override
	public List<Car> getCars() {
		TypedQuery<Car> query = em.createQuery("SELECT c FROM Car c", Car.class);
		return query.getResultList();
		
		//SELECT * FROM Car  JOIN Rental ON Car.car_id = Rental.car_Id where Rental.pickup_date < CURDATE()
		//List<Car>cars = (List<Car>) em.createNativeQuery("SELECT * FROM Car  JOIN Rental ON Car.car_id = Rental.car_Id where Rental.pickup_date < CURDATE()",Car.class).getResultList();
		//return cars;
	}

	public List<Car> getCarsByMake(String make) {
		TypedQuery query = em.createQuery("SELECT c FROM Car c WHERE c.make =:make",Car.class);
		query.setParameter("make", make);
		return query.getResultList();
	}

	@Override
	public Car findCarByRegistration(String registration) {
		System.out.println("findbyid");
		TypedQuery query = em.createQuery("SELECT c FROM Car c WHERE c.registration =:registration",Car.class);
		query.setParameter("registration", registration);
		System.out.println(query.getSingleResult());
		
		return (Car) query.getSingleResult();
	}

	@Override
	public void mergeCar(Car car,Car existingCar) {
	 
		existingCar.setBody(car.getBody());
		existingCar.setColor(car.getColor());
		existingCar.setDescription(car.getDescription());
		existingCar.setDrive(car.getDrive());
		existingCar.setEngine(car.getEngine());
		existingCar.setEquipments(car.getEquipments());
		existingCar.setFuel(car.getFuel());
		existingCar.setKilometers(car.getKilometers());
		existingCar.setMake(car.getMake());
		existingCar.setModel(car.getModel());
		existingCar.setPrice(car.getPrice());
		existingCar.setRegistration(car.getRegistration());
		existingCar.setTransmission(car.getTransmission());
		existingCar.setTrunk(car.getTrunk());
		em.merge(existingCar);	
	}
}






