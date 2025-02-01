package com.example.userRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.user;

public interface userRepo extends JpaRepository<user, Integer> {

}
