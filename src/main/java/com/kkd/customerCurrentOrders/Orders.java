package com.kkd.customerCurrentOrders;

public class Orders {
	String farmerId;
	String productId;
	String customerId;
	String orderId;
	String orderStatus;
	
	public Orders() {
		
	}
	
	public Orders(String farmerId, String productId, String customerId, String orderId, String orderStatus) {
		super();
		this.farmerId = farmerId;
		this.productId = productId;
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderStatus = orderStatus;
	}
	
	public String getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Orders [farmerId=" + farmerId + ", productId=" + productId + ", customerId=" + customerId + ", orderId="
				+ orderId + ", orderStatus=" + orderStatus + "]";
	}
	
	
	
}
