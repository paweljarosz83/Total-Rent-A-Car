package com.paweljarosz.trac.data.entities.car;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ENGINE")
public class Engine {

	@Id
	@Column(name="ENGINE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long engineid;

	@Column(name="ENGINE_CAPACITY")
	private Float capacity;

	@Column(name="HORSE_POWER")
	private Integer power;

	@Column(name="ENGINE_TYPE")
	private String type;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="engine")
	private List<Car>cars = new ArrayList<Car>();

	

	public Float getCapacity() {
		return capacity;
	}

	public void setCapacity(Float capacity) {
		this.capacity = capacity;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Long getEngineid() {
		return engineid;
	}
}