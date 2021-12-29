package com.felipesjc.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesjc.workshopmongo.domain.User;
import com.felipesjc.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
		
	}
}
