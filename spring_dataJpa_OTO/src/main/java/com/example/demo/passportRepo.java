package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Passport;

public interface passportRepo extends JpaRepository<Passport, Integer> {

}
