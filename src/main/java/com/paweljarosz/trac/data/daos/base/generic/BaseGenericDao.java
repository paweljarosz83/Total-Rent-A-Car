package com.paweljarosz.trac.data.daos.base.generic;

import java.util.List;
import org.hibernate.Session;

public interface BaseGenericDao<T,ID> {

	public T save(T entity);
	public T findById(ID id);
	public List<T>findAll();
	public void delete(T entity);
	public void flush();
	public void clear();
	public void setSession(Session session);
}
