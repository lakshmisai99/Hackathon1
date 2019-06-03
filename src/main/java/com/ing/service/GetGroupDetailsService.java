package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.ProductGroup;
import com.ing.repository.GetGroupDetailsRepository;

@Service
public class GetGroupDetailsService {
	@Autowired
	GetGroupDetailsRepository groupDetailsRepository;

	public List<ProductGroup> getGroupDetailsService(ProductGroup group) {
		
		List<ProductGroup> list=groupDetailsRepository.findAll();
		
		ProductGroup group2=new ProductGroup();
		
		
		for(int i=0;i<list.size();i++) {
			group2=list.get(i);
			group2.setProducts(group2.getProductDetails().size());
			group2.setProductDetails(null);
		}
		

		return list;

	}

}
