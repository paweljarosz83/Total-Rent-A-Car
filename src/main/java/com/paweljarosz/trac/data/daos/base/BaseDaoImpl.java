package com.paweljarosz.trac.data.daos.base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository("base")
@EnableTransactionManagement
@Transactional
public class BaseDaoImpl implements BaseDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public void create(Object entity) {
		em.persist(entity);
	}

	@Override
	public Object read(Object entity) {
		return em.find(Object.class, entity);
	}

	@Override
	public Object update(Object entity) {
		return em.merge(entity);
	}

	@Override
	public void delete(Object entity) {
		em.remove(entity);
	}
	
}
