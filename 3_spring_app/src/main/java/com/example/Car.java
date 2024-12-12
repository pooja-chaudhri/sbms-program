package com.example;

public class Car {
	
	private Engine engine;
	
	Car(){
		System.out.println("car :: constructor");
	}
	Car(Engine engine){
		this.engine = engine;
	}
	
	
	public void drive() {
		int status = engine.start();
		
		if(status >=1) {
			System.out.println("jounry started.....");
		}
		else {
			System.out.println("engine problem");
		}
	}
}
