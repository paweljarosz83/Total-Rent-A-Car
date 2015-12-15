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
	
	@Transient
	private String from;
	@Transient
	private String to;
	
	@Column(name="RETURN_POINT")
	private String returnPoint;
	
//	@Column
//	private Agent agent;
//	
//	@Column
//	private Integer mileageBefore;
//	
//	@Column
//	private boolean euTravel;

	public String getReturnPoint() {
		return returnPoint;
	}
	public void setReturnPoint(String returnPoint) {
		this.returnPoint = returnPoint;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
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
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	@ManyToOne
	@JoinColumn(name="DRIVER_ID")
	private Driver driver;
	
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

	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Long getRentalId() {
		return rentalId;
	}
	public Date getReturnDate() {
		return returnDate;
	}



}
