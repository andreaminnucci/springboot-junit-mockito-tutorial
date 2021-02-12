package com.company.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.tutorial.dto.AnagraficaDTO;
import com.company.tutorial.service.AnagraficaService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/anagrafica")
@Slf4j
public class AnagraficaController {
	
	@Autowired
	private AnagraficaService anagraficaService;    
	
	@GetMapping()
	public ResponseEntity<List<AnagraficaDTO>> list() {
		log.info("Start");
		return ResponseEntity.ok(anagraficaService.list());
	}
	
}
