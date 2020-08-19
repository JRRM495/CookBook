package com.cookbook.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cookbook.model.RateRecipe;


public interface RateRecipeDaoContract extends JpaRepository<RateRecipe, Integer> {
	@Query(value="select * from rate_recipe where user_id = ?1",
			nativeQuery = true)
	public List<RateRecipe> getRatingsByUserId(int id);
	
	@Query(value= "select * from rate_recipe where recipe_id = ?1",
	nativeQuery = true) 
	public List<RateRecipe> getRatingsByRecipeId(int id);
}
