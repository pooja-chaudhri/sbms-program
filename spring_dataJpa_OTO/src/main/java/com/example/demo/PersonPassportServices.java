package com.example.demo;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Person;

@Service
public class PersonPassportServices {

	@Autowired
	private personRepo personRepo;
	@Autowired
	private passportRepo passportRepo;

public void saveData() {
	
	Person p = new Person();
	p.setPerson_Name("janny");
	p.setPerson_Gender("female");
	
	personRepo.save(p);
	
	Passport pa = new Passport();
	pa.setPassport_num("sssl5523");
	pa.setIssuDate(LocalDate.now());
	pa.setExpDate(LocalDate.now().plusYears(10));
	
	pa.setPerson(p);
	passportRepo.save(pa);
	
}
 public void getpassport() {
	 Optional<Passport> byId = passportRepo.findById(1);
	 
	 if(byId.isPresent()) {
		 System.out.println(byId.get());
	 }
 }

}