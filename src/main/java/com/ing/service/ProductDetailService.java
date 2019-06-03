package com.ing.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.DemoModel;
import com.ing.domain.Product;
import com.ing.domain.ProductGroup;
import com.ing.repository.ProductDetailRepository;
import com.ing.repository.ProductRepository;

@Service
public class ProductDetailService {

	@Autowired
	ProductDetailRepository productDetailRepository;

	@Autowired
	ProductRepository productRepository;

	public ProductGroup getProduct(ProductGroup product) {
		// TODO Auto-generated method stub
		ProductGroup productGroup = productDetailRepository.findByGroupId(product.getGroupId());
		int count = productGroup.getGroupViewCount();
		count = count + 1;
		productGroup.setGroupViewCount(count);
		productDetailRepository.save(productGroup);
		return productGroup;
	}

	public Map getProductDetails(DemoModel demo) {
		// TODO Auto-generated method stub
		ProductGroup productGroup = productDetailRepository.findByGroupId(demo.getGroupId());

		Product product1 = productRepository.findByProductId(demo.getProductId());

		Product productTemp = new Product();
		List list = productGroup.getProductDetails();

		int productId = 0;

		for (int i = 0; i < list.size(); i++) {

			productTemp = (Product) list.get(i);

			if (demo.getProductId() == productTemp.getProductId()) {
				productId = productTemp.getProductId();
			}
		}

		int count = product1.getProductViewCount();
		count = count + 1;
		product1.setProductViewCount(count);
		productRepository.save(product1);

		Map map = new HashMap<>();
		map.put("productGroup", productGroup);
		map.put("selected", product1);

		return map;
	}

	public Map getViewCount() {
		// TODO Auto-generated method stub

		List<ProductGroup> productGroupList = productDetailRepository.findAll();

		for (int i = 0; i < productGroupList.size(); i++) {
			ProductGroup productGroup = productGroupList.get(i);
			productGroup.setProducts(productGroup.getProductDetails().size());
			productGroup.setProductDetails(null);
		}

		List<Product> productList = productRepository.findAll();

		Map map = new HashMap<>();
		map.put("productGroupList", productGroupList);
		map.put("productList", productList);
		return map;
	}

}
