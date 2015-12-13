package com.paweljarosz.trac.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paweljarosz.trac.data.entities.car.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>{

}
