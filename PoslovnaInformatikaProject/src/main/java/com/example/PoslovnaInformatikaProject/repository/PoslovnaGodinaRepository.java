package com.example.PoslovnaInformatikaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PoslovnaInformatikaProject.model.PoslovnaGodina;

public interface PoslovnaGodinaRepository extends JpaRepository<PoslovnaGodina, Integer> {
	
	List<PoslovnaGodina> findByPreduzece_idPreduzeca(Integer id);
	
	PoslovnaGodina findOneByBrojGodine(Integer brojGodine);
	
	PoslovnaGodina findOneByIdGodine(Integer id);
}
