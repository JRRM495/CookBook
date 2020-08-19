package com.cookbook.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cookbook.model.*;
public interface LikedRecipeDaoContract extends JpaRepository<LikedRecipe, Integer> {
	@Query(value= "select * from liked_recipe where user_id = ?1",
			nativeQuery = true) 
	public List<LikedRecipe> getLikedRecipesByUserId(int id);
}
