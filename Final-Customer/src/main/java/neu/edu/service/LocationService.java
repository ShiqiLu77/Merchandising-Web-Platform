package neu.edu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Location;
import neu.edu.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> viewAllLocations(){
		
		return locationRepository.findAll();
	}
	
	public List<Location> viewLocationById(Integer id){

		return locationRepository.findById(id);
	}

	

}