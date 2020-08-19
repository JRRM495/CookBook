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
import com.cookbook.model.Cookbook;
import com.cookbook.service.CookbookService;

@RestController
@CrossOrigin
@RequestMapping("/cookbooks")
public class CookbookController {
	
	@Autowired
	CookbookService cs;
	
	@GetMapping("")
	public List<Cookbook>getAllCookbooks(){
		return cs.getAllCookbooks();	
	}
	
	@GetMapping("/{id}")
	public Cookbook getCookbookById(@PathVariable int id) {
		return cs.getCookbookById(id);
	}
	
	@GetMapping("/users/{id}")
	public List<Cookbook>getCookbooksByUser(@PathVariable int id){
		return cs.getCookbooksByUserId(id);
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteCookbook(@PathVariable int id) {
		return cs.deleteCookbookById(id);
	}
	
	@PutMapping("/{id}")
	public Cookbook updateCookbook(@RequestBody Cookbook cookbook) {
		return cs.updateCookbookById(cookbook);
	}
	
	@PostMapping("")
	public Cookbook createCookbook(@RequestBody Cookbook cookbook) {
		return cs.createCookbook(cookbook);
	}
	
	
	
}
