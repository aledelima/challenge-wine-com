package br.com.asl.wine.dto;

import br.com.asl.wine.model.Store;

public class StoreBriefDto {

	private String storeCode;
	private String address;
	private String phone;

	public StoreBriefDto() {
		
	}

	public StoreBriefDto(String storeCode, String address, String phone) {
		this.storeCode = storeCode;
		this.address = address;
		this.phone = phone;
	}

	public StoreBriefDto(Store store) {
		this.storeCode = store.getStoreCode();
		this.address = store.getAddress();
		this.phone = store.getPhone();
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
