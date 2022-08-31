package com.example.PoslovnaInformatikaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PoslovnaInformatikaProject.model.PrometMagacinskeKartice;

public interface PrometMagacinskeKarticeRepository extends JpaRepository<PrometMagacinskeKartice, Integer>{
	List<PrometMagacinskeKartice> findByMagacinskaKartica_id(Integer id);
	
	PrometMagacinskeKartice findOneByRedniBroj(String redniBroj);
	
	List<PrometMagacinskeKartice> findByRedniBroj(String redniBroj);
}
