package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "courseInfo")
public class course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cId;
	private String name;
	private Double prices;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrices() {
		return prices;
	}
	public void setPrices(Double prices) {
		this.prices = prices;
	}
	
	
}
