package com.example.PoslovnaInformatikaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.PoslovnaInformatikaProject.model.PrometniDokument;
import com.example.PoslovnaInformatikaProject.model.VrstaDokumenta;

public interface PrometniDokumentRepository extends JpaRepository<PrometniDokument, Integer> {
	List<PrometniDokument> findByVrstaDokumenta(VrstaDokumenta vrstaDokumenta);

	PrometniDokument findOneById(Integer Id); 
	
	PrometniDokument findOneByRedniBroj(String redniBroj); 
 
	@Query("SELECT max(id) FROM PrometniDokument")
	Integer najveciID();
	
	List<PrometniDokument> findByRedniBroj(String redniBroj); 
}
