package com.company.tutorial.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.company.tutorial.model.Anagrafica;

public interface AnagraficaRepository extends PagingAndSortingRepository<Anagrafica, Long> {
	public List<Anagrafica> findAll();
}
