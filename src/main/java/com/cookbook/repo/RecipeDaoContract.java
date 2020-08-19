package com.cookbook.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cookbook.model.*;
public interface RecipeDaoContract extends JpaRepository<Recipe, Integer> {

	@Query(value="select * from recipe where cookbook_id = ?1",
			nativeQuery = true)
	public List<Recipe> getRecipesByCookbookId(int id);
	
	
	@Query(value="select * from Recipe r where user_id = ?1",
			nativeQuery = true)
	public List<Recipe> getRecipesByUserId(int id);
	
}
