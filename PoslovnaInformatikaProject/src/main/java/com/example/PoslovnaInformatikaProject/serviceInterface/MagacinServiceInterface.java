package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;

import com.example.PoslovnaInformatikaProject.entityDTO.MagacinDTO;

public interface MagacinServiceInterface {
	
	public List<MagacinDTO> findAll();
	public MagacinDTO findOne(Integer magacinId);
	public MagacinDTO save(MagacinDTO magacinDTO);
	public void remove(Integer magacinId);
	public List<MagacinDTO> findByPreduzece_id(Integer id);
	
	public MagacinDTO findBySifra(Integer id);
	
	public MagacinDTO update(Integer id, MagacinDTO dto);
}
