package com.cookbook.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cookbook.model.Ingredient;



public interface IngredientDaoContract extends JpaRepository<Ingredient, Integer> {
	@Query(value="select * from ingredient where recipe_id = ?1",
			nativeQuery = true)
	public List<Ingredient> getIngredientsByRecipeId(int id);
}
