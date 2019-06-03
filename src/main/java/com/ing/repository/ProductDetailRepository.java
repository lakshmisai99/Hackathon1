package com.ing.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ing.domain.ProductGroup;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductGroup, Integer>{

	ProductGroup findByGroupId(int id);

}
