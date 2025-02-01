package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.course;

public interface courseRepo extends JpaRepository<course, Integer> {

}
