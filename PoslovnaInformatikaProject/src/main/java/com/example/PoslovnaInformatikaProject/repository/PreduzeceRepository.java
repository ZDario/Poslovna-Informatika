package com.example.PoslovnaInformatikaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import com.example.PoslovnaInformatikaProject.model.Preduzece;

public interface PreduzeceRepository extends JpaRepository<Preduzece, Integer> {
	
	Preduzece findOneByIdPreduzeca(Integer preduzeceId); 
//	Preduzece findByIdPreduzecaAnd(Integer idPreduz, Integer partnerId);
//	Preduzece findOneById(Integer id);

}
