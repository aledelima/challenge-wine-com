package br.com.asl.wine.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import br.com.asl.wine.service.validation.RangeInsert;

@RangeInsert
public class ZiprangeNewDto {

	@NotEmpty(message = "Campo de preenchimento obrigatório.")
	private String storeCode;
	@Pattern(regexp="\\d{8}", message = "Campo com preenchimento indevido. Oito dígitos numéricos subsequentes são requeridos.")
	private String rangeStart;
	@Pattern(regexp="\\d{8}", message = "Campo com preenchimento indevido. Oito dígitos numéricos subsequentes são requeridos.")
	private String rangeEnd;
	
	public ZiprangeNewDto() {
	}

	public ZiprangeNewDto(String storeCode, String rangeStart, String rangeEnd) {
		this.storeCode = storeCode;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreId(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getRangeStart() {
		return rangeStart;
	}

	public void setRangeStart(String rangeStart) {
		this.rangeStart = rangeStart;
	}

	public String getRangeEnd() {
		return rangeEnd;
	}

	public void setRangeEnd(String rangeEnd) {
		this.rangeEnd = rangeEnd;
	}
	
}
