package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
public class productRestControllor {

	@GetMapping(value = "/product",produces = "application/json")
	public ResponseEntity<product> getproduct(){

		product p = new product(101,"laptop",3999.00);
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@GetMapping(value = "/param",produces = "application/json")
	public ResponseEntity<String> getqueryparam(@RequestParam("id")Integer id){

		String msg = " ";
		
		if(id == 101) {
			msg = " query parameter sending successful";
		}
		else {
			msg ="Error occurs";
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping(value = "/pathvariable/{id}",produces = "application/json")
	public ResponseEntity<String> getpathvariable(@PathVariable("id")Integer id){

		String msg = " ";
		
		if(id == 101) {
			msg = " query parameter sending successful";
		}
		else if(id == 102) {
			msg = "query parameter id = 102";
		}
		else {
			msg ="Error occurs";
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
	
	@GetMapping(value="/products",produces = "application/json")
	public ResponseEntity<List<product>> getproducts(){
		
		product p = new product(102,"computor",77777.937);
		product p2 = new product(103,"pcu",666.99);
		product p3 = new product(104,"monitor",444.66);
		
		List<product> asList = Arrays.asList(p,p2,p3);
		
		return new ResponseEntity<>(asList,HttpStatus.OK);
		
				
	}
	
	@PostMapping(value = "/Requestbody",consumes = "application/json",produces = "text/plan")
	public ResponseEntity<String> getrequesrbody(@RequestBody product product){

		//System.out.println("product id :: "+id);
		System.out.println(product);
		
		String msg = "product saved successfully";
		
		
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	

	@DeleteMapping(value = "/update/{id}",consumes = "application/json",produces = "text/plan")
	public ResponseEntity<String> getdelete(@RequestBody product product,@PathVariable("id")Integer id){

		System.out.println("product id :: "+id);
		System.out.println(product);
		
		String msg = "product delete and update successfully";
		
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
