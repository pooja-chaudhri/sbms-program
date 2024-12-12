package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Person;

public interface personRepo extends JpaRepository<Person, Integer> {

}
