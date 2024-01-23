package com.example.dinemaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dinemaster.model.Chef;

public interface ChefJpaRepository extends JpaRepository<Chef, Integer>{

}
