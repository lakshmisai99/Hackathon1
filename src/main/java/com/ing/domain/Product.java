package com.ing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private int productViewCount;
	private Double precentage;
	private String special;
	private String investmentType;
	private Double minLimit;
	private Double maxLimit;
	private String duration;
	
	
	
	
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductViewCount() {
		return productViewCount;
	}
	public void setProductViewCount(int productViewCount) {
		this.productViewCount = productViewCount;
	}
	public Double getPrecentage() {
		return precentage;
	}
	public void setPrecentage(Double precentage) {
		this.precentage = precentage;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getInvestmentType() {
		return investmentType;
	}
	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}
	public Double getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(Double minLimit) {
		this.minLimit = minLimit;
	}
	public Double getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(Double maxLimit) {
		this.maxLimit = maxLimit;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
