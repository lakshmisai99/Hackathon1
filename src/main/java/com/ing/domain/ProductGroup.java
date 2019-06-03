package com.ing.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="PRODUCT_GROUP")
public class ProductGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int groupId;
	String groupName;
	int groupViewCount;
	
	@OneToMany(fetch = FetchType.EAGER,cascade= CascadeType.ALL)
	@JoinColumn(name = "group_id")
	List<Product> productDetails;
	
	@Transient
	int products;
	


	public int getProducts() {
		return products;
	}

	public void setProducts(int products) {
		this.products = products;
	}

	public int getGroupViewCount() {
		return groupViewCount;
	}

	public void setGroupViewCount(int groupViewCount) {
		this.groupViewCount = groupViewCount;
	}

	public ProductGroup(int groupId) {
		super();
		this.groupId = groupId;
	}

	public ProductGroup() {
		super();
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Product> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<Product> productDetails) {
		this.productDetails = productDetails;
	}

	

	

}
