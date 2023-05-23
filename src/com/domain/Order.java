package com.domain;

public class Order {

	

	
	public Order(boolean valid, int totalAmount, String orderId, Status status) {
		super();
		this.valid = valid;
		this.totalAmount = totalAmount;
		this.orderId = orderId;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	private boolean valid;
	private double totalAmount;
	private String orderId;
	private Status status;
	
	public boolean isValid() {
		return valid;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void showOrder() {
		System.out.println("Order with: " + orderId + " and status " + status);
	}
	
}
