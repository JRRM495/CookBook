package com.cookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookbook.model.RateRecipe;
import com.cookbook.repo.RateRecipeDaoContract;

@Service
public class RateRecipeService {

	@Autowired
	RateRecipeDaoContract rr;


	public List<RateRecipe> getRateRecipeByUserId(int id) {
		return rr.getRatingsByUserId(id);
	}


	public List<RateRecipe> getRateRecipeByRecipeId(int id) {
		
		return rr.getRatingsByRecipeId(id);
	}


	public RateRecipe createRate(RateRecipe rate) {
		
		return rr.save(rate);
	}


	public String deleteRate(int id) {
		rr.deleteById(id);
		return "deleted rate with id: " + id;
	}

}
