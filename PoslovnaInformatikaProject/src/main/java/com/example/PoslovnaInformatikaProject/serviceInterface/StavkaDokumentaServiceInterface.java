package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;

import com.example.PoslovnaInformatikaProject.entityDTO.StavkaDokumentaDTO;
import com.example.PoslovnaInformatikaProject.model.StavkaDokumenta;

public interface StavkaDokumentaServiceInterface {

	public List<StavkaDokumenta> findAll();
	
	public StavkaDokumenta findOne(Integer id);
	
	public List<StavkaDokumentaDTO> save(List<StavkaDokumentaDTO> stavke, Integer idDokumenta) throws Exception;
	
	public void remove(Integer id);
	
	public StavkaDokumenta findById(Integer id);
	
	public List<StavkaDokumenta> findByPrometniDokument_id(Integer id);
	
	public List<StavkaDokumenta> findByRobaIliUsluga_sifra(Integer id);
}
