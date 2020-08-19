package com.cookbook.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cookbook.model.Recipe;
import com.cookbook.service.RecipeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/recipes")
public class RecipeController {
	
	
	@Autowired
	RecipeService rs;
	
	@GetMapping("")
	public List<Recipe> getRecipe(){
		return rs.getAllRecipes();
	}
	
	@GetMapping("/{id}")
	public Recipe getRecipeById(@PathVariable int id) {
		return rs.getRecipeById(id);
	}
	
	@GetMapping("/cookbooks/{id}")
	public List<Recipe> getRecipeByCookbook(@PathVariable int id){
		return rs.getRecipeByCookbook(id);
	}
	
	
	@GetMapping("/users/{id}")
	public List<Recipe> getRecipeByUserId(@PathVariable int id){
		return rs.getRecipeByUserId(id);
	}
	
	@PostMapping("")
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return rs.createRecipe(recipe);
	}
	
	@PutMapping("")
	public Recipe updateRecipe(@RequestBody Recipe recipe) {
		return rs.updateRecipe(recipe);
	}
	
	@DeleteMapping("/{id}")
	public String deleteRecipe(@PathVariable int id){
		return rs.deleteRecipe(id);	
	}
	


}
