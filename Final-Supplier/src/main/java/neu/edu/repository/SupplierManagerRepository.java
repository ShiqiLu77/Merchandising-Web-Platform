package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.SupplierManager;

public interface SupplierManagerRepository extends JpaRepository<SupplierManager, Object>{
	
	List<SupplierManager> findBySupplierId(Integer id);
	
	List<SupplierManager> findAll();

	SupplierManager findByUsername(String username);
}