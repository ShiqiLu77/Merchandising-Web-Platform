package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Material;

public interface  MaterialRepository extends JpaRepository<Material, Object>{
	
	List<Material> findAll();
	
	List<Material> findBySupplierId(Integer id);
	

}
