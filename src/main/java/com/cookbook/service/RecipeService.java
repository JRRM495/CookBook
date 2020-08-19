package com.cookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookbook.model.Recipe;
import com.cookbook.repo.RecipeDaoContract;

@Service
public class RecipeService {
	
	@Autowired
	RecipeDaoContract rd;

	public List<Recipe> getAllRecipes() {
		return rd.findAll();
	}

	public List<Recipe> getRecipeByCookbook(int id) {
		
		return rd.getRecipesByCookbookId(id);
	}

	public Recipe createRecipe(Recipe recipe) {	
		return rd.save(recipe);
	}

	public Recipe updateRecipe(Recipe recipe) {
		return rd.save(recipe);
	}

	public String deleteRecipe(int id) {
		
		 rd.deleteById(id);
		 return "deleted recipe with id:" + id;
	}

	public Recipe getRecipeById(int id) {
		return rd.findById(id).orElse(null);
	}

	public List<Recipe> getRecipeByUserId(int id) {
		
		return rd.getRecipesByUserId(id);
	}
	

	
	

}
