package com.example;

public class DebitCard implements Ipayment{

	public DebitCard() {
		System.out.println("debitcard :: constructor");
	}
	@Override
	public int pay() {
		return 1;
	}
	
	
}
