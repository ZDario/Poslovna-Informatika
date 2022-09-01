package com.example.PoslovnaInformatikaProject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PoslovnaInformatikaProject.entityDTO.PrometMagacinskeKarticeDTO;
import com.example.PoslovnaInformatikaProject.serviceInterface.PrometMagacinskeKarticeServiceInterface;


@RestController
@RequestMapping(value = "api/promet-magacinske-kartice")
public class PrometMagacinskeKatriceController {
	
	@Autowired
	private PrometMagacinskeKarticeServiceInterface prometMagacinskeKarticeService;
	
	@GetMapping
	public ResponseEntity<List<PrometMagacinskeKarticeDTO>> getPrometiMagKart(){
		
		return ResponseEntity.ok().body(prometMagacinskeKarticeService.findAll());
	}
	
	@GetMapping(value = "/{idKartice}")
	public ResponseEntity<List<PrometMagacinskeKarticeDTO>> getPrometiMagKartByKartica(@PathVariable ("idKartice") Integer idKartice){
		
		return ResponseEntity.ok().body(prometMagacinskeKarticeService.findByMagacinskaKartica(idKartice));
	}
	
	@GetMapping(value = "storniraj/{redniBroj}")
	public ResponseEntity<PrometMagacinskeKarticeDTO> getOnePromet(@PathVariable("redniBroj") String redniBroj) throws Exception{
		
		return ResponseEntity.ok().body(prometMagacinskeKarticeService.findByRedniBroj(redniBroj));
	}
	
}
