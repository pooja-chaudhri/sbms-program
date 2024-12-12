package com.example;

public class DiselEngine implements Iengine {
	
	public DiselEngine() {
		System.out.println("DiselEngine :: constructor");
	}
	@Override
	public int start() {
		System.out.println("DiselEngine Started.....");
		return 1;
	}

}
