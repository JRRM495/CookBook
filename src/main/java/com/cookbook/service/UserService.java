package com.cookbook.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookbook.model.User;
import com.cookbook.repo.UserDaoContract;

@Service
public class UserService {
	
	@Autowired
	UserDaoContract ud;

	public User updateUser(User u) {
		return ud.save(u);
	}

	public User getOneUser(int id) {
		return ud.findById(id).orElse(null);
	}

	public User createUser(User u) {
		return ud.save(u);
	}

	public List<User> findAllUsers() {	
		return ud.findAll();
	}

	public String deleteUser(int id) {
		ud.deleteById(id);
		return "User with id: " + id + " was deleted.";
	}
	
	public User login(String username, String password) {
		return ud.login(username, password);
	}

}
