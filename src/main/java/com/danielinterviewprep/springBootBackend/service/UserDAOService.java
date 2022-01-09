package com.danielinterviewprep.springBootBackend.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.danielinterviewprep.springBootBackend.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public UserDAOService() {
		
	}
	
	public long insert(User u) {
		entityManager.persist(u);
		return u.getId();
	}

}
