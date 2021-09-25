package com.logos.aulas_dio.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logos.aulas_dio.model.Product;
import com.logos.aulas_dio.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@PostMapping
	Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
	}
	
    @GetMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Long id) {
        return productRepository.findById(id);
    }

}
