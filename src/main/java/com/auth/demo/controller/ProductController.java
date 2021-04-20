package com.auth.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.auth.demo.service.ProductService;

@Controller
class ProductController {

   @Autowired 
   private ProductService productService;

   @GetMapping(path = "/products")
   public String getProducts(Model model){
	   System.out.println("templates");
      model.addAttribute("products", productService.getProducts());
      return "product";
   }

   @GetMapping(path = "/logout")
   public String logout(HttpServletRequest request) throws ServletException {
      request.logout();
      return "/";
   }
}