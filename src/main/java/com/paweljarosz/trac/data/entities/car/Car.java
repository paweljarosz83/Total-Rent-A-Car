package com.paweljarosz.trac.data.entities.car;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CAR")
public class Car {
	
	private enum Drive{
		FRONT,REAR,AWD,IWD
	}
	private enum Transmission{
		AUTOMATIC,MANUAL,SEMI_AUTOMATIIC
	}
	
	@Id
	@Column(name="CAR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long carId;

	//@Size//(min=1, max=50, message="{car.make}")
	@Column(name="MODEL")
	private String model;
	//@Size
	@Column(name="MAKE")
	private String make;
	//@Size
	@Column(name="REGISTRATION_NUMBER")
	private String registration;
	
	//@NotBlank(message="")
	@Column(name="HORSE_POWER")
	private Integer power;
	//@NotBlank(message="")
	@Column(name="TRUNK_SIZE")
	private Integer trunk;
	//walidacja nie jest wymagana, zawsze jest cos wybrane
	@Column(name="FUEL")
	private String fuel;
	
	//@Size
	@Column(name="BODY")
	private String body;
	
	//@NotBlank
	@Column(name="YEAR")
	private Integer year;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	//@NotBlank
	@Column(name="KILOMETER")
	private Integer kilometers;
	
	@Size
	@Column(name="COLOR")
	private String color;
	
	//@NotBlank
	@Column(name="PRICE")
	private Integer price;
	
	@ElementCollection
	@CollectionTable(name="CAR_EQUIPMENTS",joinColumns=@JoinColumn(name="CAR_ID"))
	@Column(name="EQUIPMENT")
	private List<String> equipments = new ArrayList<String>();
	
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="DRIVE")
	private Drive drive;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TRANSMISSION")
	private Transmission transmission;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ENGINE_ID")
	private Engine engine;
	
	
	
	
	
	
	
	
//	@OneToMany(mappedBy="car")
//	private List<Rental> rentals;
//	public List<Rental> getRentals() {
//		return rentals;
//	}
//	public void setRentals(List<Rental> rentals) {
//		this.rentals = rentals;
//	}
	
	//CAR
	//@NotBlank(message = "must not be null")
	
	
	
	
	
	
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
	
	
	
	

	public Integer getTrunk() {
		return trunk;
	}
	public void setTrunk(Integer trunk) {
		this.trunk = trunk;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Long getCarId() {
		return carId;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getBody() {
		return body;
	}

	
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public List<String> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<String> equipments) {
		this.equipments = equipments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	public Integer getKilometers() {
		return kilometers;
	}

	public void setKilometers(Integer kilometers) {
		this.kilometers = kilometers;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Drive getDrive() {
		return drive;
	}
	
	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	
	

}
