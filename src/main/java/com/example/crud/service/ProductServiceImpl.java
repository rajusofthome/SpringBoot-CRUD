package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Product;
import com.example.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductservice {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> getProduct(long id) {
		return productRepository.findById(id);

	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}

}
