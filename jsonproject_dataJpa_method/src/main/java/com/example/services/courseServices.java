package com.example.services;

import java.util.List;

import com.example.entity.course;

public interface courseServices {
	
	public String upsert(course course);
	
	public course getbyId( Integer cId);
	
	public List<course> getallcourse();	
	
	public String delete(Integer cId);
	

}
