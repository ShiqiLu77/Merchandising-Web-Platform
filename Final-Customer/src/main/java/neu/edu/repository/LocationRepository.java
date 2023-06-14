package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Address;
import neu.edu.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Object>{

	List<Location> findAll();
	
	List<Location> findById(Integer id);
	
}