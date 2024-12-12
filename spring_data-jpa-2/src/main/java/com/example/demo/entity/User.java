package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user_info")
public class User {
	@Id
	private Integer id;
	private String name;
	private String gender;
	private String country;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate created;
	
	@CreationTimestamp
	@Column(insertable = false)
	private LocalDate updated;

}
