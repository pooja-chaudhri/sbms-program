package com.example.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.course;
import com.example.services.courseServices;


@RestController
public class courseRestControllor {

	@Autowired
	private courseServices services;
	 
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody course course){
		
		String status = services.upsert(course);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody course Course) {

		String upsert = services.upsert(Course);

		return new ResponseEntity<>(upsert, HttpStatus.OK);
	}
	
	
	@GetMapping("/course/{cId}")
	public ResponseEntity<course>getcourse(@PathVariable Integer cId){
		
		course getbyId = services.getbyId(cId);
		
		return new ResponseEntity<>(getbyId,HttpStatus.OK);
	}
	
	
	@GetMapping("/allcourse")
	public ResponseEntity<List<course>> getallcourse(){
		
		 List<course> getallcourse = services.getallcourse();
		 
		 return new ResponseEntity<>(getallcourse,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{cId}")
	public ResponseEntity<String> deletebyId(@PathVariable Integer cId){
		
		String delete = services.delete(cId);
		
		return new ResponseEntity<>(delete,HttpStatus.OK);
	}
	
}
