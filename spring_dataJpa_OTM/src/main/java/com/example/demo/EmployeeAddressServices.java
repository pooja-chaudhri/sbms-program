package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.addressRepo;
import com.example.demo.Repo.employeeRepo;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;

@Service
class EmployeeAddressServices {

	@Autowired
	private employeeRepo employeeRepo;
	@Autowired
	private addressRepo addressRepo;
	
	public void saveData() {
		
		Employee e = new Employee();
	
		e.setEmpName("jhon");
		e.setEmpGender("male");
		

		
		Address a = new Address();
		
		a.setCity("hy");
		a.setState("tg");
		a.setType("present");
		
		Address a1 = new Address();
		
		a1.setCity("banglore");
		a1.setState("ka");
		a1.setType("parmanent");
		
		
		List<Address> list = Arrays.asList(a,a1);
		
		e.setAddress(list);
		a.setEmp(e);
		a1.setEmp(e);
		employeeRepo.save(e);
		
		
	
		
		
		
		
	}
}
