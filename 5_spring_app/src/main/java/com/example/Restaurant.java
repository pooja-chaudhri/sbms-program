package com.example;

public class Restaurant {
	
	private Ipayment ipayment;
	
	public Restaurant() {
		System.out.println("restaurant :: constructor");
	}
	
	public Restaurant(Ipayment ipayment) {
		this.ipayment = ipayment;
	}
	
	public void bill() {
		int pay = ipayment.pay();
		
		if(pay >= 1) {
			System.out.println("payment successful!");
		}
		else {
			System.out.println("transation fail");
		}
	}

}
