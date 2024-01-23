package com.example.dinemaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "firstName")
	String firstName;
	
	@Column(name = "lastName")
	String lastName;
	
	@Column(name = "experiense")
	String expertise;
	
	@Column(name = "experienceYears")
	int experienceYears;
	
	@Column(name = "restaurant")
	Restaurant restaurant;
	
	public Restaurant() {}

	public Restaurant(int id, String firstName, String lastName, String expertise, int experienceYears,
			Restaurant restaurant) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.expertise = expertise;
		this.experienceYears = experienceYears;
		this.restaurant = restaurant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
}
