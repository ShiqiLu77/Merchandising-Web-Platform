package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Supplier;

public interface  SupplierRepository extends JpaRepository<Supplier, Object>{
	
	List<Supplier> findAll();
	
	Supplier findById(Integer id);
	

}
