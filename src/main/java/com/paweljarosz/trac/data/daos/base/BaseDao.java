package com.paweljarosz.trac.data.daos.base;

public interface BaseDao {
	
	void create(Object entity);
	Object read(Object entity);
	Object update(Object entity);
	void delete(Object entity);

}
