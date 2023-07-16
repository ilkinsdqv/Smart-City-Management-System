package az.demo.smartcity.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.demo.smartcity.model.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Integer> {
	
	public static final String FIND_CITIES = "SELECT city FROM feature";

	@Query(value = FIND_CITIES, nativeQuery = true)
	public ArrayList<String> findAllCities();

}
