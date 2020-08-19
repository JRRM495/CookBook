package com.cookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookbook.model.Ingredient;
import com.cookbook.repo.IngredientDaoContract;

@Service
public class IngredientService {
	
	@Autowired
	IngredientDaoContract idc;

	public List<Ingredient> getIngredientsByRecipe(int id) {
		return idc.getIngredientsByRecipeId(id);
	}

	public List<Ingredient> getAllIngredients() {
		return idc.findAll();
	}

	public Ingredient getIngredientById(int id) {
		return idc.findById(id).orElse(null);
	}

	public String deleteIngredient(int id) {
		
		 idc.deleteById(id);
		 return "deleted ingredient with id: " + id;
	}

	public Ingredient createIngredient(Ingredient ingredient) {
		return idc.save(ingredient);
	}
	
	

}
