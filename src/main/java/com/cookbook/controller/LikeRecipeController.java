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
import com.cookbook.model.LikedRecipe;
import com.cookbook.service.LikeRecipeService;

@RestController
@CrossOrigin
@RequestMapping("/likerecipe")
public class LikeRecipeController {
	
	@Autowired
	LikeRecipeService ls;
	
	@GetMapping("/users/{id}")
	public List<LikedRecipe> getLikedRecipeByUserId(@PathVariable int id) {
		return ls.getLikedRecipeByUserId(id);
	}
	
	@PostMapping("")
	public LikedRecipe likeRecipe(@RequestBody LikedRecipe likedRecipe) {
		return ls.createLikedRecipe(likedRecipe);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteLike(@PathVariable int id) {
		return ls.deleteLike(id);
	}
	
	
	

}
