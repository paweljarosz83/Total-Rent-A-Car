package com.paweljarosz.trac.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.paweljarosz.trac.data.entities.car.Car;

@SessionAttributes()
@Repository
public interface CarRepository extends JpaRepository<Car,Long>{

}
