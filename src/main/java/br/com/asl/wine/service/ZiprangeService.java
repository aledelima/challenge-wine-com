package br.com.asl.wine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asl.wine.dto.ZiprangeNewDto;
import br.com.asl.wine.dto.ZiprangeUpdateDto;
import br.com.asl.wine.model.Store;
import br.com.asl.wine.model.Ziprange;
import br.com.asl.wine.repository.ZiprangeRepository;
import br.com.asl.wine.service.exception.ObjectNotFoundException;

@Service
public class ZiprangeService {

	@Autowired
	private ZiprangeRepository zRepository;
	
	@Autowired
	private StoreService sService;
	
	public Ziprange fromNewDto(ZiprangeNewDto dto) {
		Store store = sService.findByStoreCode(dto.getStoreCode());
		return new Ziprange(null, store, Integer.parseInt(dto.getRangeStart()), Integer.parseInt(dto.getRangeEnd()));
	}
	
	public Ziprange fromUpdateDto(ZiprangeUpdateDto dto) {
		Store store = sService.findByStoreCode(dto.getStoreCode());
		return new Ziprange(dto.getId(), store, Integer.parseInt(dto.getRangeStart()), Integer.parseInt(dto.getRangeEnd()));
	}
	
	public List<Ziprange> findAll() {
		return zRepository.findAll();
	}
	
	public Ziprange findById(Integer id) {
		Optional<Ziprange> range = zRepository.findById(id);
		return range.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo:  " + Ziprange.class.getName()));
	}
	
	public Ziprange insert(Ziprange range) {
		range.setId(null);
		return zRepository.save(range);
	}
	
	public Ziprange update(Ziprange range) {
		return zRepository.save(range);
	}
	
	public void deleteById(Integer id) {
		findById(id);
		zRepository.deleteById(id);
	}
	
}
