package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.example.PoslovnaInformatikaProject.entityDTO.PrometniDokumentDTO;
import com.example.PoslovnaInformatikaProject.model.PrometniDokument;

public interface PrometniDokumentServiceInterface {

	List<PrometniDokument> findAll();
	PrometniDokumentDTO save(PrometniDokumentDTO prometniDokument) throws Exception;
	PrometniDokument findOneById(Integer id);
	PrometniDokument findOneByRedniBroj(String redniBroj);
	String findByMaxid();
	List<PrometniDokument> findByRedniBroj(String redniBroj);
	
	public ResponseEntity report(String broj);
}
