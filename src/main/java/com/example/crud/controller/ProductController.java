package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Product;
import com.example.crud.service.IProductservice;

@RestController
public class ProductController {

	@Autowired
	private IProductservice productService;

	@PostMapping(value = "/createproduct")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product prd = productService.createProduct(product);
		return new ResponseEntity<Product>(prd, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getproduct")
	public ResponseEntity<Optional<Product>> getProduct(@RequestParam("id") long id) {
		Optional<Product> prd = productService.getProduct(id);
		return new ResponseEntity<Optional<Product>>(prd, HttpStatus.OK);
	}

	@GetMapping(value = "/getproducts")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> prd = productService.getProducts();
		return new ResponseEntity<List<Product>>(prd, HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteproduct")
	public ResponseEntity<String> deleteProduct(@RequestParam("id") long id) {
		productService.deleteProduct(id);
		return new ResponseEntity<String>("Product Deleted", HttpStatus.OK);
	}

}
