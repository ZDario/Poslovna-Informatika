package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;

import com.example.PoslovnaInformatikaProject.entityDTO.PreduzeceDTO;
import com.example.PoslovnaInformatikaProject.model.Preduzece;

public interface PreduzeceServiceInterface {

	public List<PreduzeceDTO> findAll();
	
	public Preduzece findOne(Integer preduzeceId);
	
	public PreduzeceDTO save(PreduzeceDTO preduzeceDTO);
	
	public void remove(Integer id);
	
	public PreduzeceDTO findById(Integer preduzeceId) throws Exception;
	
	public PreduzeceDTO update(Integer id,PreduzeceDTO pdto) throws Exception;
	
}
