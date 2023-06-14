package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.ManufactureManager;

public interface  ManufactureManagerRepository extends JpaRepository<ManufactureManager, Object>{
	
	List<ManufactureManager> findAll();
	
	List<ManufactureManager> findByManufactureId(Integer id);
	
	ManufactureManager findByUsername(String username);
	

}
