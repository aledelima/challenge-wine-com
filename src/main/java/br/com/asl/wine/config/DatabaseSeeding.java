package br.com.asl.wine.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.asl.wine.model.Store;
import br.com.asl.wine.model.Ziprange;
import br.com.asl.wine.repository.StoreRepository;
import br.com.asl.wine.repository.ZiprangeRepository;

@Configuration
public class DatabaseSeeding implements CommandLineRunner {

	@Autowired
	StoreRepository sRepository;
	
	@Autowired
	ZiprangeRepository zRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//LOJA_PINHEIROS|10000000|20000000AND20000001|30000000
		Store pinheiros = new Store(null, "LOJA_PINHEIROS", "Bairro dos Pinheiros", "2215-3030");
		pinheiros = sRepository.save(pinheiros);
		Ziprange r1 = new Ziprange(null, pinheiros, 10000000, 20000000);
		r1 = zRepository.save(r1);
		Ziprange r2 = new Ziprange(null, pinheiros, 20000001, 30000000);
		r2 = zRepository.save(r2);
		
		//LOJA_JARDINS|30000001|40000000
		Store jardins = new Store(null, "LOJA_JARDINS", "Bairro Jardins", "2234-5520");
		jardins = sRepository.save(jardins);
		Ziprange r3 = new Ziprange(null, jardins, 30000001, 40000000);
		r3 = zRepository.save(r3);
		Ziprange r4 = new Ziprange(null, jardins, 40000001, 50000000);
		r4 = zRepository.save(r4);
	}

}
