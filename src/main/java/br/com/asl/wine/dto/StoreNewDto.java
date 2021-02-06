package br.com.asl.wine.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class StoreNewDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String storeCode;
	private String address;
	private String phone;
	
	public StoreNewDto() {
	}

	public StoreNewDto(String storeCode, String address, String phone) {
		this.storeCode = storeCode;
		this.address = address;
		this.phone = phone;
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
