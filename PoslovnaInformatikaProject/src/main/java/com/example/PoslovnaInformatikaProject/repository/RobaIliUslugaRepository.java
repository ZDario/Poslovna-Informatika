package com.example.PoslovnaInformatikaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PoslovnaInformatikaProject.model.RobaIliUsluga;

public interface RobaIliUslugaRepository extends JpaRepository<RobaIliUsluga, Integer>{

	RobaIliUsluga findOneBySifra(Integer Id);
}
