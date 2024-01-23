package com.example.dinemaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chef")
public class Chef {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "cuisineType")
	String cuisineType;
	
	@Column(name = "rating")
	int rating;
	
	public Chef() {
		
	}
	
	public Chef(int id, String name, String address, String cuisineType, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.cuisineType = cuisineType;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
