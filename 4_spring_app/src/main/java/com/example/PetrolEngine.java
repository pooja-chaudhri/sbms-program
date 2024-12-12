package com.example;

public class PetrolEngine implements Iengine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine :: construcor");
	}
    @Override
	public int start() {
		System.out.println("PetrolEngine started......");
		return 1;
	}
}
