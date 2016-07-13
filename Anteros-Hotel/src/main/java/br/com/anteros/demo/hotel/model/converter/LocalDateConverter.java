package br.com.anteros.demo.hotel.model.converter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import br.com.anteros.persistence.metadata.annotation.Converter;
import br.com.anteros.persistence.metadata.converter.AttributeConverter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate data) {
		return Date.from(((LocalDate) data).atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		return Instant.ofEpochMilli(dbData.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
	}
}
