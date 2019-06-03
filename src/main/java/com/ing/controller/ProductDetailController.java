package com.ing.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.DemoModel;
import com.ing.domain.ProductGroup;
import com.ing.service.GetGroupDetailsService;
import com.ing.service.ProductDetailService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("/api")
public class ProductDetailController {
	
	@Autowired
	ProductDetailService productService;
	
	@Autowired
	GetGroupDetailsService getGroupDetailsService;

	
	@RequestMapping(value = "/products", method = RequestMethod.POST, consumes = "application/json")
	public ProductGroup getProduct(@RequestBody ProductGroup product) {
		ProductGroup productGroup1=productService.getProduct(product);

		return productGroup1;
	}
	
	
	
	@RequestMapping(value = "/productDetails", method = RequestMethod.POST, consumes = "application/json")
	public Map getProductDetails(@RequestBody DemoModel product) {
		Map productGroup1=productService.getProductDetails(product);
		return productGroup1;
	}
	
	
	
	@GetMapping("/getGroup")
	public List<ProductGroup> getGroupDetails(ProductGroup group) {
		return getGroupDetailsService.getGroupDetailsService(group);

	}

	@GetMapping("/viewCount")
	public Map getViewCount() {
		return productService.getViewCount();

	}	
	
}
