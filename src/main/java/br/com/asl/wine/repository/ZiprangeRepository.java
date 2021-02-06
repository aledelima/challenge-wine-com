package br.com.asl.wine.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.asl.wine.model.Ziprange;

@Repository
public interface ZiprangeRepository extends JpaRepository<Ziprange, Integer> {
	
	/**
	 * Weather a ziprange is already covered by ANY Store
	 * @param zipcode
	 * @param storeCode
	 * @return
	 */
	@Query("SELECT z FROM Ziprange z WHERE ?1 BETWEEN z.rangeStart AND z.rangeEnd")
	public Optional<Ziprange> rangeOccupied(Integer zipcode);
	
	/**
	 * Weather a ziprange is already covered by ANY OTHER register, apart from the current one (ziprange id).
	 * @param zipcode
	 * @param storeCode
	 * @return
	 */
	@Query("SELECT z FROM Ziprange z WHERE z.id <> ?2 AND ?1 BETWEEN z.rangeStart AND z.rangeEnd")
	public Optional<Ziprange> rangeOccupied(Integer zipcode, Integer ziprangeId);
	
}
