package neu.edu.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Address;
import neu.edu.entity.Location;
import neu.edu.service.AddressService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@GetMapping("/view")
	@ResponseStatus()
	public List<Address> viewAllAddresses(){

		return addressService.viewAllAddresses();
	}
	
	@GetMapping("/view/{id}")
	@ResponseStatus()
	public List<Address> viewAllAddressesById(@PathVariable Integer id){
		
		return addressService.viewAllAddressesById(id);
	
	}
	
	@GetMapping("/view/location/{location_id}")
	@ResponseStatus()
	public List<Address> viewAllAddressesByLocationId(@PathVariable Integer location_id){
		
		return addressService.viewAllAddressesByLocationId(location_id);
	
	}
	
	
}