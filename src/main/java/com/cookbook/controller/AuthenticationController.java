package com.cookbook.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import io.jsonwebtoken.io.*;
import io.jsonwebtoken.lang.*;
import io.jsonwebtoken.security.*;
import net.minidev.json.JSONObject;

import com.cookbook.model.User;
import com.cookbook.service.*;
@Controller
@CrossOrigin
public class AuthenticationController {
	
	@Autowired
	private UserService us; 

	@GetMapping("/{username}/{password}")
	public @ResponseBody String login(@PathVariable("username") String username, @PathVariable("password") String password) {
		JSONObject ob = new JSONObject();
		User user = us.login(username, password);
		if (user == null) {
			ob.put("failed", "failed login");
			return ob.toString();
		}
		String id = Integer.toString(user.getId());
		Date date = new Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR,2);
		Date expirationDate = cal.getTime();
		String jwt = Jwts.builder().setSubject(id).setExpiration(expirationDate).setIssuedAt(date).compact();
		ob.put("idtoken", jwt);
		ob.put("expiresIn", 7200);
		ob.put("User", user);
		String jsonString = ob.toString();
		return jsonString;
	}
}
