package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByProductId(int id);
	
}
