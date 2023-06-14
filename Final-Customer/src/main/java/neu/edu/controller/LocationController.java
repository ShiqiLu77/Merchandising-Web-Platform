package neu.edu.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Location;
import neu.edu.service.LocationService;


@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;

	@GetMapping("/view")
	public @ResponseBody List<Location> viewAllLocations(){

		return locationService.viewAllLocations();
	}
	
	@GetMapping("/view/{id}")
	public @ResponseBody List<Location> viewLocationById(@PathVariable Integer id){
		
		return locationService.viewLocationById(id);
	
	}
	
	
//	@GetMapping("/view")
//	public @ResponseBody List<Address> viewAllUsers(){
//		
//		return addressService.viewAllAddresses();
//	}
	
//	@GetMapping("/view/{id}")
//	public @ResponseBody Address viewAllAddressesById(@PathVariable Integer id){
//		return addressService.viewAllAddressesById(id);
//	}
	
}