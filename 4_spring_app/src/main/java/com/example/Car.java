package com.example;

public class Car {
	
	private Iengine iengine;
	
	public Car() {
		System.out.println("Car :: constructor");
	}
	
	public Car(Iengine iengine) {
		this.iengine = iengine;
		System.out.println("Car::param-constructor");
	}
	public void setIengine(Iengine iengine) {
		this.iengine = iengine;
		System.out.println("setter method :: car");
	}
	
	public void drive() {
		int status = iengine.start();
		
		if(status >= 1) {
			System.out.println("jounry started......");
		}
		else {
			System.out.println("Engine started......");
		}
	}

}
