package com.example.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.course;
import com.example.repo.courseRepo;
import com.example.services.courseServices;
@Service
public class courseServicesImp implements courseServices{

	@Autowired
	private courseRepo courserepo;
	
	@Override
	public String upsert(course course) {

		courserepo.save(course);
		return "success";
	}
	
	@Override
	public course getbyId(Integer cId) {
		Optional<course> byId = courserepo.findById(cId);
		
		if(byId.isPresent()) {
			return byId.get();
		}
	return null;	
	}
	
	@Override
	public List<course> getallcourse() {
		 return courserepo.findAll();
		
	}
	
	@Override
	public String delete(Integer cId) {
		if(courserepo.existsById(cId)) {
			courserepo.deleteById(cId);
			return "delete success";
		}
		else {
			return "record not found";
		}
		
	}
}
