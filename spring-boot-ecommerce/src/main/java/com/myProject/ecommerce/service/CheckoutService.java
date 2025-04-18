package com.myProject.ecommerce.service;

import com.myProject.ecommerce.dto.Purchase;
import com.myProject.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
