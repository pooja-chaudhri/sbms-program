package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.employee;

public interface EmpRepo extends CrudRepository<employee, Integer> {

}
