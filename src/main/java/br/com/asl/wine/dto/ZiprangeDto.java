package br.com.asl.wine.dto;

import java.io.Serializable;

import br.com.asl.wine.model.Ziprange;

public class ZiprangeDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String storeCode;
	private String rangeStart;
	private String rangeEnd;
	
	public ZiprangeDto() {
	}

	public ZiprangeDto(Integer id, String storeCode, String rangeStart, String rangeEnd) {
		this.id = id;
		this.storeCode = storeCode;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
	}

	public ZiprangeDto(Ziprange range) {
		this.id = range.getId();
		this.storeCode = range.getStore().getStoreCode();
		this.rangeStart = Integer.toString(range.getRangeStart());
		this.rangeEnd = Integer.toString(range.getRangeEnd());	
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
