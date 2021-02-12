package com.company.tutorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "anagrafica")
public class Anagrafica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "nome", length = 40, nullable = false)
	private String nome;
	
	@Column(name = "cognome", length = 40, nullable = false)
	private String cognome;
	
	@Column(name = "codice_fiscale", length = 16, nullable = false, unique = true)
	private String codiceFiscale;

}
