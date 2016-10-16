package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;

@Controller
public class UserController {
	@RequestMapping("/create")
	  @ResponseBody
	  public String create(String email, String name) {
	    String userId = "";
	    try {
	      User user = new User(email, name);
	     
	      
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created with id = " + userId;
	  }
}
