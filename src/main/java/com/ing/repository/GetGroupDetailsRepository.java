
package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.domain.ProductGroup;

public interface GetGroupDetailsRepository extends JpaRepository<ProductGroup, Long> {

	
}
