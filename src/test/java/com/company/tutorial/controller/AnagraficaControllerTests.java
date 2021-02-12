package com.company.tutorial.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.company.tutorial.dto.AnagraficaDTOConverter;
import com.company.tutorial.repository.AnagraficaRepository;
import com.company.tutorial.service.AnagraficaService;

//@WebMvcTest( { AnagraficaController.class, AnagraficaService.class, AnagraficaDTOConverter.class, AnagraficaRepository.class })
@SpringBootTest
public class AnagraficaControllerTests {
		
	@Autowired
	private WebApplicationContext webApplicationContext;
	 
	private MockMvc mockMvc;
	
	@BeforeEach
	public void setUp() {
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	/*
	@BeforeEach
	public void setup() {
	    this.mvc = MockMvcBuilders.standaloneSetup(new TaskController(new TaskService()))
	      .setControllerAdvice()
	      .setLocaleResolver(localResolver)
	      .addInterceptors(interceptorOne)
	      .build();
	  }
	*/
	
	@Test
	public void list() throws Exception {
		this.mockMvc.perform( MockMvcRequestBuilders
			      .get("/anagrafica")
			      .accept(MediaType.APPLICATION_JSON))
			      .andDo(MockMvcResultHandlers.print())
			      .andExpect(MockMvcResultMatchers.status().isOk());
		/*
			      .andExpect(MockMvcResultMatchers.jsonPath("$.anagrafica").exists())
			      .andExpect(MockMvcResultMatchers.jsonPath("$.anagrafica[*].nome").isNotEmpty());*/
	}
}
