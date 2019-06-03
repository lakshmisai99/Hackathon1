package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ing.domain.ProductGroup;
import com.ing.repository.ProductDetailRepository;

public class ProductServiceTest extends AbstractTest{

	@Autowired
	ProductDetailRepository productDetailRepository;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
	}
	
	@Test
	public void test() {
		ProductGroup productGroup = new ProductGroup();
		productGroup = productDetailRepository.findByGroupId(111);
		System.out.println("productGroup----->>>>>"+productGroup.getGroupName());
		assertEquals("Hypotheek", productGroup.getGroupName());
	}

}
