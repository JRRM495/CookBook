package com.cookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cookbook.model.LikedRecipe;
import com.cookbook.repo.LikedRecipeDaoContract;

@Service
public class LikeRecipeService {
	
	@Autowired
	LikedRecipeDaoContract lr;

	public List<LikedRecipe> getLikedRecipeByUserId(int id) {
		return lr.getLikedRecipesByUserId(id);
	}

	public LikedRecipe createLikedRecipe(LikedRecipe likedRecipe) {
		
		return lr.save(likedRecipe);
	}

	public String deleteLike(int id) {
		lr.deleteById(id);
		return "Like deleted with id: " + id;
	}
	
	

	
}
