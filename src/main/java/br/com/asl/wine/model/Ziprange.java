package br.com.asl.wine.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ziprange implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Store store;
	@Column(nullable = false)
	private Integer rangeStart;
	@Column(nullable = false)
	private Integer rangeEnd;
	
	public Ziprange() {
	}

	public Ziprange(Integer id, Store store, Integer rangeStart, Integer rangeEnd) {
		this.id = id;
		this.store = store;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Integer getRangeStart() {
		return rangeStart;
	}

	public void setRangeStart(Integer rangeStart) {
		this.rangeStart = rangeStart;
	}

	public Integer getRangeEnd() {
		return rangeEnd;
	}

	public void setRangeEnd(Integer rangeEnd) {
		this.rangeEnd = rangeEnd;
	}

	@Override
	public String toString() {
		return "ZipcodeRange [id=" + id + ", rangeStart=" + rangeStart + ", rangeEnd=" + rangeEnd + "]";
	}
	
}
