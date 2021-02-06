package br.com.asl.wine.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.asl.wine.model.Store;
import br.com.asl.wine.model.Ziprange;

public class StoreDto {

	private Integer id;
	private String storeCode;
	private String address;
	private String phone;
	private List<ZiprangeDto> zipRanges = new ArrayList<>();

	public StoreDto() {
		
	}

	public StoreDto(Integer id, String storeCode, String address, String phone) {
		this.id = id;
		this.storeCode = storeCode;
		this.address = address;
		this.phone = phone;
	}

	public StoreDto(Store store) {
		this.id = store.getId();
		this.storeCode = store.getStoreCode();
		this.address = store.getAddress();
		this.phone = store.getPhone();
		for (Ziprange range: store.getZipRanges()) {
			this.zipRanges.add(new ZiprangeDto(range));
		}
	}

	public void addRange(ZiprangeDto rangeDto) {
		this.zipRanges.add(rangeDto);
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

	public List<ZiprangeDto> getZipRanges() {
		return zipRanges;
	}

	public void setZipRanges(List<ZiprangeDto> zipRanges) {
		this.zipRanges = zipRanges;
	}
	
}
