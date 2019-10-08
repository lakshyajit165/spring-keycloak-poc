package com.stackroute.keycloakdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Arrays;

@SpringBootApplication
public class KeycloakdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakdemoApplication.class, args);
	}

}

@Controller
class ProductController{

	@GetMapping(path="/products")
	public String getProducts(Principal principal, Model model){
		model.addAttribute("principal",principal);
		model.addAttribute("products", Arrays.asList("iPad", "iPhone", "iPod"));
		return "products";
	}

	@GetMapping(path="/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
