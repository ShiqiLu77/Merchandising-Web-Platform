package neu.edu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Address;
import neu.edu.entity.Customer;
import neu.edu.repository.AddressRepository;
import neu.edu.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer findCustomerByUsername(String username) {

		return customerRepository.findByUsername(username);
	}

}