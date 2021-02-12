package com.company.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.tutorial.dto.AnagraficaDTO;
import com.company.tutorial.dto.AnagraficaDTOConverter;

import com.company.tutorial.repository.AnagraficaRepository;

@Service
@Transactional
public class AnagraficaService {

	@Autowired
	private AnagraficaDTOConverter dtoConverter;  
	
	@Autowired
	private AnagraficaRepository anagraficaRepository;
	
	public List<AnagraficaDTO> list() {
		List<AnagraficaDTO> dtos = new ArrayList<>(); 
		anagraficaRepository.findAll().forEach(e -> {
			dtos.add( dtoConverter.entityToDTO(e) );
		});
		return dtos; 
	}
}
