package com.company.tutorial.dto;

import org.springframework.stereotype.Component;

import com.company.tutorial.model.Anagrafica;

@Component
public class AnagraficaDTOConverter extends AbstractDTOConverter<AnagraficaDTO, Anagrafica> {

	@Override
	public AnagraficaDTO entityToDTO(Anagrafica entity) {
		return new AnagraficaDTO.AnagraficaDTOBuilder()
				.nome( entity.getNome() )
				.cognome( entity.getCognome() )
				.codiceFiscale( entity.getCodiceFiscale() )
		.build();
	}

	@Override
	public Anagrafica dtoToEntity(AnagraficaDTO dto) {
		Anagrafica anagrafica = new Anagrafica();
		anagrafica.setNome( dto.getNome() );
		anagrafica.setCognome( dto.getCognome() );
		anagrafica.setCodiceFiscale( dto.getCodiceFiscale() );
		return anagrafica;
	}
	
}
