package com.example.SpringBootFirstDemo.Ass2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {
	
		@RequestMapping("/userlogin/{uname}/{pwd}")
		public String getMessage(@PathVariable("uname") String username, @PathVariable("pwd") String password) {
			String User = "kesava";
			String Pass = "kesava90";
			
			if(username.equals(User) && password.equals(Pass)) {
				return "Valid User";
			} else {
				return "Invalid User";
			}
		}
	}


