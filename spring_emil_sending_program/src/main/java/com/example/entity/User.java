package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userEmail;
	private Long userphNo;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdat;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedat;
}
