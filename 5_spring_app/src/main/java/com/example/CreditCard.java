package com.example;

public class CreditCard implements Ipayment {
	
	public CreditCard() {
		System.out.println("creditcard::constructor");
	}
	
	@Override
	public int pay() {
		return 1;
	}
	
	

}
