package com.myProject.ecommerce.dto;

import lombok.Data;


public class PurchaseResponse {

    private final String orderTrackingNumber;

	public PurchaseResponse(String orderTrackingNumber) {
		super();
		this.orderTrackingNumber = orderTrackingNumber;
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}
    
    
    

}
