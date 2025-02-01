package com.example;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class jhonToobject {

	public void convertJavatoJhon() throws Exception{
		
		customer cst = new customer();
		cst.setCustomerId(101);
		cst.setCustomerName("jhon");
		cst.setCustomerPhone(234556);
		
		File f = new File("customer.jhon");
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(f, cst);
		
		System.out.println("serialization sucessfull ...");
	}
		
		public void convertjhonTojava() throws Exception{
			
			File file = new File("customer.jhon");
			
			ObjectMapper mapper = new ObjectMapper();
			
			customer value = mapper.readValue(file, customer.class);
			
			System.out.println(value);
			
		}
	
	
	public static void 
	main(String[] args) throws Exception {
		

		jhonToobject jto = new jhonToobject();
		//jto.convertJavatoJhon();
		jto.convertjhonTojava();
	}

}
