package com.example;

public class SonyPrinter implements IPrinter {
	
	 public SonyPrinter() {
		 System.out.println("SonyPrinter :: constructor");
	 }
	 
	 @Override
	public void print() {
		
		 System.out.println("SonyPrinter recept print....");
	}
}
