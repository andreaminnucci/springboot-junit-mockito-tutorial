package com.company.tutorial.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnagraficaDTO {

	@NotNull
	@Pattern(regexp = "\b{1, 40}")
	private String nome;
	
	@NotNull
	@Pattern(regexp = "\b{1, 40}")
	private String cognome;
	
	@NotNull
	@Pattern(regexp = "^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$")
	private String codiceFiscale;
	
}
