package az.demo.smartcity.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.demo.smartcity.model.Feature;
import az.demo.smartcity.repository.FeatureRepository;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class FeatureRestController {

	@Autowired
	private FeatureRepository featureRepository;
	
	
	
	@PostMapping(path = "/add-features")
	public Feature saveFeature(@RequestBody Feature feature) {
		return featureRepository.save(feature);
	}
	
	
	
	@GetMapping(path="/select-city-category")
	public ArrayList<String> findCities() {
		ArrayList<String> cities = new ArrayList<String>();
		for (String city : featureRepository.findAllCities()) {
			if(!cities.contains(city)) {
				cities.add(city);
			}
		}
		
		return cities;
	}
	
	@GetMapping(path = "/view-features-admin")
	public List<Feature> findAllFeatures(){
		return featureRepository.findAll();
	}
	
	@DeleteMapping(path = "/view-features-admin/{id}")
	public void deleteFeatureById(@PathVariable Integer id) {
		featureRepository.deleteById(id);
	}
	
	@GetMapping(path = "/view-features-admin/{id}")
	public Feature findFeatureById(@PathVariable Integer id) {
		return featureRepository.findById(id).get();
	}
	
}
