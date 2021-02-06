package br.com.asl.wine.dto;

import br.com.asl.wine.model.Store;

public class StorecodeDto {

	private String storecode;

	public StorecodeDto() {
	}
	
	public StorecodeDto(Store store) {
		this.storecode = store.getStoreCode();
	}

	public String getStorecode() {
		return storecode;
	}

	public void setStorecode(String storecode) {
		this.storecode = storecode;
	}
	
}
