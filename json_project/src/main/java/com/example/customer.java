package com.example;

public class customer {
	
	private Integer customerId;
	private String customerName;
	private Number customerPhone;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Number getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(Number customerPhone) {
		this.customerPhone = customerPhone;
	}
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + "]";
	}
	
	

}
