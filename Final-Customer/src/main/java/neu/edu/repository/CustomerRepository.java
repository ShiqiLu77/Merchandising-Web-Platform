package neu.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Object>{

	
	Customer findByUsername(String username);
}