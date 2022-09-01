package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;

import com.example.PoslovnaInformatikaProject.entityDTO.PoslovniPartnerDTO;

public interface PoslovniPartnerServiceInterface {

	List<PoslovniPartnerDTO> findAll();
	PoslovniPartnerDTO save(PoslovniPartnerDTO poslovniPartnerDTO);
	PoslovniPartnerDTO update(Integer id, Integer idPreduzeca, PoslovniPartnerDTO pdto);
	public void remove(Integer sifraPartnera);
	PoslovniPartnerDTO findOneBySifraPartnera(Integer id);
	
}
