package br.com.asl.wine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asl.wine.dto.StoreNewDto;
import br.com.asl.wine.model.Store;
import br.com.asl.wine.repository.StoreRepository;
import br.com.asl.wine.service.exception.ObjectNotFoundException;

@Service
public class StoreService {

	@Autowired
	private StoreRepository repository;
	
	public List<Store> findAll() {
		return repository.findAll();
	}
	
	public Store findById(Integer id) {
		Optional<Store> store = repository.findById(id);
		return store.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo:  " + Store.class.getName()));
	}
	
	public Store findByStoreCode(String storecode) {
		Optional<Store> store = repository.findByStoreCode(storecode);
		return store.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! StoreCode: " + storecode + ", Tipo:  " + Store.class.getName()));
	}
	
	public Store findByZipcode(Integer zipcode) {
		Optional<Store> store = repository.findByZipcode(zipcode);
		return store.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Nenhuma loja coberta pelo CEP procurado. Zipcode: " + zipcode + ", Tipo:  " + Store.class.getName()));
	}
	
	public Store fromNewDto(StoreNewDto dto) {
		return new Store(null, dto.getStoreCode(), dto.getAddress(), dto.getPhone());
	}
	

	public Store insert(Store store) {
		return repository.save(store);
	}
}
