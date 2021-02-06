package br.com.asl.wine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String storeCode;
	private String address;
	private String phone;
	@OneToMany(mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Ziprange> zipRanges = new ArrayList<>();
	
	public Store() {
	}

	public Store(Integer id, String storeCode, String address, String phone) {
		this.id = id;
		this.storeCode = storeCode;
		this.address = address;
		this.phone = phone;
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

	public List<Ziprange> getZipRanges() {
		return zipRanges;
	}

	public void addZipRange(Ziprange zipRange) {
		this.zipRanges.add(zipRange);
	}
	
	public void removeZipRange(Ziprange zipRange) {
		this.zipRanges.remove(zipRange);
	}
	
}
