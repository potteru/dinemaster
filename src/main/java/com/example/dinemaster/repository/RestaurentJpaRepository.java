package com.example.dinemaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dinemaster.model.Restaurant;

public interface RestaurentJpaRepository extends JpaRepository<Restaurant, Integer>{

}
