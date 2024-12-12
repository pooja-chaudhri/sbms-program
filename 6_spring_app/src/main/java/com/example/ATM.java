package com.example;

public class ATM {

	private IPrinter iprinter;
	
	public ATM() {
		System.out.println("ATM :: constructor");
	
	}
	 
	public void setIprinter(IPrinter iprinter) {
		this.iprinter = iprinter;
	}


	public void withdraw() {
		System.out.println("withdraw successful !");
		iprinter.print();
	}
}
