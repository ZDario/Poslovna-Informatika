package com.example.PoslovnaInformatikaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PoslovnaInformatikaProject.model.PoslovniPartner;

public interface PoslovniPartnerRepository extends JpaRepository<PoslovniPartner, Integer> {
	PoslovniPartner findOneBySifraPartnera(Integer id);
}
