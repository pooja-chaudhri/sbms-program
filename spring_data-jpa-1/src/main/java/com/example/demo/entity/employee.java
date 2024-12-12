package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class employee {

	@Id
	private Integer empId;
	private String empName;
	private Double empsal;
}
