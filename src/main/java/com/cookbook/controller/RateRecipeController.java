package com.cookbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cookbook.model.RateRecipe;
import com.cookbook.service.RateRecipeService;

@RestController
@CrossOrigin
@RequestMapping("/raterecipe")
public class RateRecipeController {
	@Autowired
	RateRecipeService rs;
	
	
	@GetMapping("/users/{id}")
	public List<RateRecipe> getRatedRecipeByUserId(@PathVariable int id) {
		return rs.getRateRecipeByUserId(id);
	}
	
	@GetMapping("/recipes/{id}")
	public List<RateRecipe> getRatedRecipeByRecipeId(@PathVariable int id){
		return  rs.getRateRecipeByRecipeId(id);
		
	}
	

	@PostMapping("")
	public RateRecipe createRate(RateRecipe rate) {
		return rs.createRate(rate);
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteRate(@PathVariable int id) {
		return rs.deleteRate(id);
	}
}
