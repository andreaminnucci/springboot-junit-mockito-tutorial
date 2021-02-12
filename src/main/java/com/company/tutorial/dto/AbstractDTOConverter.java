package com.company.tutorial.dto;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractDTOConverter<DTO, ENTITY> {

	abstract public DTO entityToDTO(ENTITY entity);
	
	abstract public ENTITY dtoToEntity(DTO dto);
	
	public List<DTO> entitiesToDTOs(List<ENTITY> entities) {
		return entities.stream()
				.map(e -> this.entityToDTO(e))
				.collect(Collectors.toList());
	}
	
	public List<ENTITY> dtosToEntities(List<DTO> dtos) {
		return dtos.stream()
				.map(d -> this.dtoToEntity(d))
				.collect(Collectors.toList());
	}
}
