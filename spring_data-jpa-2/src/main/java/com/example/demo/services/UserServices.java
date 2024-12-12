 package com.example.demo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServices {

	private UserRepository userRepo;

	public UserServices(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
		System.out.println("inpl class ::" +userRepo.getClass().getName());
	
	}
	public void deleteAll() {
		userRepo.deleteAll();
	}
	
	public void saveuser() {
		
		User u = new User();
		u.setId(1001);
		u.setName("jhon");
		u.setGender("male");
		u.setCountry("USA");
		
		userRepo.save(u);
		
	}
	public void saveUsers() {
		User u2 = new User();
		u2.setId(1002);
		u2.setName("jany");
		u2.setGender("female");
		u2.setCountry("USA");
		
		User u3 = new User();
		u3.setId(1003);
		u3.setName("king");
		u3.setGender("male");
		u3.setCountry("india");
		
		User u4 = new User();
		u4 .setId(1004);
		u4 .setName("miller");
		u4 .setGender("male");
		u4 .setCountry("japan");
		
		User u5  = new User();
		u5.setId(1005);
		u5.setName("jakky");
		u5.setGender("male");
		u5.setCountry("india");
		
		List<User> user = Arrays.asList(u2,u3,u4,u5);
		
		userRepo.saveAll(user);
	}
	
	public void finduser() {
		Iterable<User> all = userRepo.findAll();
		all.forEach(user -> System.out.println(user.getName()));
	}
	
	public void countUser() {
		userRepo.count();
	}
	
	public void findid() {
		userRepo.findById(104);
	}
	
}
