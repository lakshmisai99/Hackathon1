package com.ing.domain;

public class DemoModel {

	int productId;
	int groupId;
	public DemoModel() {}
	
	public DemoModel(int productId, int groupId) {
		super();
		this.productId = productId;
		this.groupId = groupId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	
	
	
}
