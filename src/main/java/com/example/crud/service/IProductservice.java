package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import com.example.crud.model.Product;

public interface IProductservice {

	public Product createProduct(Product product);

	public Optional<Product> getProduct(long id);

	public List<Product> getProducts();

	public void deleteProduct(long id);

}
