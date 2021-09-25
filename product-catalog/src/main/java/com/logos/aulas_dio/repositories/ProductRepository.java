package com.logos.aulas_dio.repositories;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.logos.aulas_dio.model.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, Long> {
	
    List<Product> findByName(String name);

}