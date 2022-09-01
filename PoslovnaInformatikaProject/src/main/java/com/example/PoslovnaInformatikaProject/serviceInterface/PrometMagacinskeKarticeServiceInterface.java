package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;

import com.example.PoslovnaInformatikaProject.entityDTO.PrometMagacinskeKarticeDTO;

public interface PrometMagacinskeKarticeServiceInterface {

public List<PrometMagacinskeKarticeDTO> findAll();
	
	public PrometMagacinskeKarticeDTO findOne(String redniBroj);
	
	public PrometMagacinskeKarticeDTO save(Integer id, PrometMagacinskeKarticeDTO prometMagacinskeKarticeDTO);
	
	public void remove(Integer id);
	
	public List<PrometMagacinskeKarticeDTO> findByMagacinskaKartica(Integer id);
	
	public PrometMagacinskeKarticeDTO findByRedniBroj(String redniBroj) throws Exception;
}
