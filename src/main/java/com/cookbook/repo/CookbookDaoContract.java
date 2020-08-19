package com.cookbook.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cookbook.model.Cookbook;


public interface CookbookDaoContract extends JpaRepository<Cookbook, Integer> {
	@Query(value="select * from cookbook where user_id = ?1",
			nativeQuery = true)
	public List<Cookbook> getCookbooksByUserId(int id);
}
