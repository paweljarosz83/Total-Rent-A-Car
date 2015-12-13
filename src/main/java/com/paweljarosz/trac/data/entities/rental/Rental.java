package com.paweljarosz.trac.data.entities.rental;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.driver.Driver;

@Entity
@Table(name="RENTAL")
public class Rental {

	@Id
	@Column(name="RENTAL_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long rentalId;

	@Column(name="PICKUP_DATE")
	private Date pickupDate;
	
	@Column(name="RETURN_DATE")
	private String returnDate;

	@ManyToOne
	@JoinColumn(name="DRIVER_ID")
	private Driver driver;
	
	//private Date fromDate;
	
	@Transient
	private String nameAndSurname;

	private String carRegistrations;
	
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}


	
	//@ManyToOne
	//@JoinColumn(name="CAR_ID")
	//private Car car;
//	public Car getCar() {
//		return car;
//	}
//	public void setCar(Car car) {
//		this.car = car;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public String getCarRegistrations() {
		return carRegistrations;
	}
	public void setCarRegistrations(String carRegistrations) {
		this.carRegistrations = carRegistrations;
	}
	//	public Date getFromDate() {
//		return fromDate;
//	}
//	public void setFromDate(Date fromDate) {
//		this.fromDate = fromDate;
//	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Long getRentalId() {
		return rentalId;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}


}
