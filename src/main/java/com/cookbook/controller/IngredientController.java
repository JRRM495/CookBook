package com.cookbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cookbook.model.Ingredient;
import com.cookbook.service.IngredientService;

@RestController
@CrossOrigin
@RequestMapping("/ingredients")
public class IngredientController {
	
	@Autowired
	IngredientService is;

	@GetMapping("/recipes/{id}")
	public List<Ingredient>getIngredientsByRecipe(@PathVariable int id) {
		return is.getIngredientsByRecipe(id);
	}
	
	@GetMapping("")
	public List<Ingredient>getAllIngredients(){
		return is.getAllIngredients();
	}
	
	@GetMapping("/{id}")
	public Ingredient getIngredientById(@PathVariable int id) {
		return is.getIngredientById(id);
	}
	
	@PostMapping("")
	public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
		return is.createIngredient(ingredient);
	}
	
	@DeleteMapping("/{id}")
	public String deleteIngredient(@PathVariable int id) {
		return is.deleteIngredient(id);	
	}
	
}
