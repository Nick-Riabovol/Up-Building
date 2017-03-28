package com.upbuilding.dao;

import java.util.List;

/**
 * ICRUD
 * v1.0
 * @author Hedgehog
 */
public interface ICRUD<T> {
	public T create(T obj) throws Exception;
	public void createOrUpdate(T obj) throws Exception;
	public void update(T obj) throws Exception;
	public void delete(T obj) throws Exception;
	public void delete(int id) throws Exception;
	public List<T> get() throws Exception;
	public T get(int id) throws Exception;
}