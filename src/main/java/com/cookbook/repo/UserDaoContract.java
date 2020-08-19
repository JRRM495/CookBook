package com.cookbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cookbook.model.User;

@Repository
public interface UserDaoContract extends JpaRepository<User, Integer> {
	@Query(value="select * from user where username = ?1 and password = ?2",
			nativeQuery = true)
	public User login(String username, String password);
}
