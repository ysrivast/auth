package com.auth.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<String> getProducts() {
	      return Arrays.asList("iPad","iPod","iPhone");
	   }
}
