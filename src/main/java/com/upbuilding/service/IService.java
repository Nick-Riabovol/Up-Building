package com.upbuilding.service;

import java.util.List;

/**
 * IService
 * v1.0
 * @author Hedgehog
 */
public interface IService<T> {
	public T create(T obj);
	public void createOrUpdate(T obj);
	public void update(T obj);
	public void delete(T obj);
	public void delete(int id);
	public List<T> get();
	public T get(int id);
}