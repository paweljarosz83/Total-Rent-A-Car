package com.paweljarosz.trac.data.daos.rental;

import org.springframework.stereotype.Repository;

import com.paweljarosz.trac.data.daos.base.BaseDaoImpl;
import com.paweljarosz.trac.data.entities.rental.Rental;

@Repository
public class RentalDaoImpl	extends BaseDaoImpl implements RentalDao{

	@Override
	public void delete(Long id) {

		Rental r = em.find(Rental.class, id);
		em.remove(r);
	}
}