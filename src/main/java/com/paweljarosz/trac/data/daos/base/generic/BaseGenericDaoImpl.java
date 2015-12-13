package com.paweljarosz.trac.data.daos.base.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class BaseGenericDaoImpl<T,ID extends Serializable>implements BaseGenericDao<T,ID> {

	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> persistentClass;
	private Session session;
	
	@SuppressWarnings("unchecked")
	public BaseGenericDaoImpl(){
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	public Class<T> getPersistentClass(){
		return persistentClass;
	}
	public void setSession(Session session){
		this.session = session;
	}
	
	protected Session getSession(){
		if(this.session == null){
			this.session = em.unwrap(Session.class);
		}
		return this.session;
	}
	
	
	@Override
	public T save(T entity) {
		this.getSession().saveOrUpdate(entity);
		return entity;
	}
	@Override
	public void delete(T entity) {
		this.getSession().delete(entity);
	}
	@SuppressWarnings("unchecked")
	@Override
	public T findById(ID id) {
		return (T) getSession().load(this.getPersistentClass(), id);
	}
	@Override
	public List<T> findAll() {
		return this.findByCriteria();
	}

	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion ... criterion){
		Criteria crit = this.getSession().createCriteria(this.getPersistentClass());
		
		for(Criterion c: criterion){
			crit.add(c);
		}
		return (List<T>) crit.list();
	}
	@Override
	public void flush() {
		this.getSession().flush();
	}

	@Override
	public void clear() {
		this.getSession().clear();
	}
}
