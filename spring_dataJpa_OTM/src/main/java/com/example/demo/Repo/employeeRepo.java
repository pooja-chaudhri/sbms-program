package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface employeeRepo extends JpaRepository<Employee, Integer>{

}
