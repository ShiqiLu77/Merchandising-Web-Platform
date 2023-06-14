package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Object>{

	List<Address> findAll();
	
	List<Address> findById(Integer id);
	
	List<Address> findByLocationId(Integer location_id);
}