package com.paweljarosz.trac.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paweljarosz.trac.data.entities.driver.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long>{

}
