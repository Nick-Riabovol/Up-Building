package com.upbuilding.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.upbuilding.domain.User;

/**
 * UserDAO
 * v1.0
 * @author Hedgehog
 */
public class UserDAO extends DAO implements ICRUD<User> {

	public User create(User obj) throws Exception {
		try {
			super.begin();
			User user = new User(obj.getLogin(), obj.getEmail(), obj.getPassword());
			super.getSession().save(user);
			super.commit();
			return user;
		} catch (HibernateException e) {
			super.rollback();
            throw new Exception("Could not create user: " + obj.getLogin(), e);
		} finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

	public void createOrUpdate(User obj) throws Exception {
		try {
			super.begin();
			super.getSession().saveOrUpdate(obj);
			super.commit();
		} catch (HibernateException e) {
			super.rollback();
            throw new Exception("Could not create of update user: " + obj.getLogin(), e);
		} finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

	public void update(User obj) throws Exception {
		try {
			super.begin();
			super.getSession().update(obj);
			super.commit();
		} catch (HibernateException e) {
			super.rollback();
            throw new Exception("Could not create user: " + obj.getLogin(), e);
		} finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

	public void delete(User obj) throws Exception {
		try {
			super.begin();
            super.getSession().delete(obj);
            super.commit();
        } catch (HibernateException e) {
        	super.rollback();
            throw new Exception("Could not delete user: " + obj.getLogin(), e);
        } finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

	public void delete(int id) throws Exception {
		try {
			super.begin();
			User user = new User();
			user.setId(id);
            super.getSession().delete(user);
            super.commit();
        } catch (HibernateException e) {
        	super.rollback();
            throw new Exception("Could not delete user id: " + id, e);
        } finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

	public List<User> get() throws Exception {
		try {
			super.begin();
			@SuppressWarnings({ "deprecation", "unchecked" })
			List<User> list = super.getSession().createCriteria(User.class).list();
			super.commit();
			if(list.size() > 0)
		        return list;
		    return null;  
		} catch (HibernateException e) {
			super.rollback();
            throw new Exception("Could not get all Users", e);
		} finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

	public User get(int id) throws Exception {
		try {
			super.begin();
			User user = super.getSession().get(User.class, id);
			super.commit();
		    return user;  
		} catch (HibernateException e) {
			super.rollback();
            throw new Exception("Could not get User by id: " + id, e);
		} finally {
			if (super.getSession() != null && super.getSession().isOpen()) {
				super.getSession().close();
			}
		}
	}

}