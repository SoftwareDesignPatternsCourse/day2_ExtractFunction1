package com.processor;

import com.domain.Order;
import com.domain.Status;

public class OrderProcessor {

	public static void processOrder(Order order) {
	    if (order.isValid()) {
	        if (order.getTotalAmount() > 100) {
	        	System.out.println("Appliying a discount to order: " + order.getOrderId() + " with amount: " + order.getTotalAmount());
	        	order.setTotalAmount(order.getTotalAmount() * 0.9);
	        	System.out.println("After the discount discount: " + order.getTotalAmount());
	        	order.setStatus(Status.REQUEST_APPROVAL);
	        } else {
	            System.out.println("Notification the order: " + order.getOrderId() + " will be sent");
	            order.setStatus(Status.SENT);
	        }
	    } else {
	        order.setStatus(Status.CANCELLED);
	    }
	}
	
}
