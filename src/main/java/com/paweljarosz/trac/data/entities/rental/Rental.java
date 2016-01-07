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

import com.paweljarosz.trac.data.entities.branch.Agent;
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
	private Date returnDate;
	
	@Column(name="RETURN_POINT")
	private String returnPoint;
	
	@ManyToOne
	@JoinColumn(name="DRIVER_ID")
	private Driver driver;
	
	@ManyToOne
	@JoinColumn(name="CAR_ID")
	private Car car;
	
	@Transient
	private String from;
	@Transient
	private String to;
	@Transient
	private String nameAndSurname;
	
	private String carDetails;

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnPoint() {
		return returnPoint;
	}

	public void setReturnPoint(String returnPoint) {
		this.returnPoint = returnPoint;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}

	

	public String getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(String carDetails) {
		this.carDetails = carDetails;
	}

	public Long getRentalId() {
		return rentalId;
	}
}
