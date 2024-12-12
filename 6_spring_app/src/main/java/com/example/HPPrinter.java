package com.example;

public class HPPrinter implements IPrinter {
	
	public HPPrinter() {
		System.out.println("HPPrinter :: constructor");
	}
	
	@Override
	public void print() {
	System.out.println("HPPrinter recept printed....");
		
	}

}
