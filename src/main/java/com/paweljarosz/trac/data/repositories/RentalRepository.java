package com.paweljarosz.trac.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paweljarosz.trac.data.entities.rental.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental,Integer> {

}
