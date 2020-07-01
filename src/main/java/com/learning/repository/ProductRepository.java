package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.learning.domain.Product;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@RestResource(path = "productName")
	List<Product> findByName(@Param("name") String name);

	@RestResource(path = "productPrice")
	List<Product> findByPrice(@Param("price") Double price);

	@RestResource(path = "nameandprice")
	List<Product> findByNameAndPrice(@Param("name") String name, @Param("price") Double price);

}
