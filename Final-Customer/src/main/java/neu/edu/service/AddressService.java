package neu.edu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Address;
import neu.edu.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> viewAllAddresses(){
	
		return addressRepository.findAll();
	}
	
	public List<Address> viewAllAddressesById(Integer id){

		return addressRepository.findById(id);
	}

	
	public List<Address> viewAllAddressesByLocationId(Integer location_id){

		return addressRepository.findByLocationId(location_id);
	}

}