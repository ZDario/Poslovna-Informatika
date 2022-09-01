package com.example.PoslovnaInformatikaProject.serviceInterface;

import java.util.List;
import com.example.PoslovnaInformatikaProject.entityDTO.JedinicaMereDTO;
public interface JedinicaMereServiceInterface {

	public List<JedinicaMereDTO> findAll();
	public JedinicaMereDTO findOneById(Integer id);
	public JedinicaMereDTO save(JedinicaMereDTO jedinicaMereDTO);
	public void remove(Integer idJediniceMere);
	public JedinicaMereDTO update(Integer id, JedinicaMereDTO jedinicaMereDTO);
}
