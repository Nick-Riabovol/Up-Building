package com.upbuilding.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upbuilding.domain.User;
import com.upbuilding.dao.UserDAO;
/**
 * UserService
 * v1.0
 * @author Hedgehog
 */
@Service
public class UserService implements IService<User> {
	// TODO Пока короче реализация методов такая, но тут подумать надо. Сейчас просто заглушки, я о том что в catch
	@Autowired
	private UserDAO userDAO;

	@Transactional
	public User create(User obj) {
		try {
			return this.userDAO.create(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	public void createOrUpdate(User obj) {
		try {
			this.userDAO.createOrUpdate(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public void update(User obj) {
		try {
			this.userDAO.update(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public void delete(User obj) {
		try {
			this.userDAO.delete(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public void delete(int id) {
		try {
			this.userDAO.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public List<User> get() {
		try {
			return this.userDAO.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	public User get(int id) {
		try {
			return this.userDAO.get(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
	}

}
