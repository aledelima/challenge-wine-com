package br.com.asl.wine.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import br.com.asl.wine.service.validation.RangeUpdate;

@RangeUpdate
public class ZiprangeUpdateDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "Campo de preenchimento obrigatório.")
	private Integer id;
	@NotEmpty(message = "Campo de preenchimento obrigatório.")
	private String storeCode;
	@Pattern(regexp="\\d{8}", message = "Campo com preenchimento indevido. Oito dígitos numéricos subsequentes são requeridos.")
	private String rangeStart;
	@Pattern(regexp="\\d{8}", message = "Campo com preenchimento indevido. Oito dígitos numéricos subsequentes são requeridos.")
	private String rangeEnd;
	
	public ZiprangeUpdateDto() {
	}

	public ZiprangeUpdateDto(Integer id, String storeCode, String rangeStart, String rangeEnd) {
		this.id = id;
		this.storeCode = storeCode;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
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
