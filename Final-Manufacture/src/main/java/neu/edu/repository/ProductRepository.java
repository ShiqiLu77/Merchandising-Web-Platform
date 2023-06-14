package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Product;

public interface  ProductRepository extends JpaRepository<Product, Object>{
	
	List<Product> findAll();
	
	List<Product> findByManufactureId(Integer id);
	

}
