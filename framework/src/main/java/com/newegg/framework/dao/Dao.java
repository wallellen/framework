/**
 * 
 */
package com.newegg.framework.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:wallellen@hotmail.com">Walle</a>
 * 
 *         2014年1月27日
 */
public interface Dao<T extends Serializable, PK extends Serializable> {
	void create(T t);

	T get(PK id);

	List<T> findAll();

	void update(T t);

	void delete(T t);

	void deleteById(PK id);

	void deleteAll();

	Long count();

	boolean exists(PK id);
}
