package com.example.PoslovnaInformatikaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PoslovnaInformatikaProject.model.JedinicaMere;


public interface JedinicaMereRepository extends JpaRepository<JedinicaMere, Integer>{
	JedinicaMere findOneById(Integer id);
}
