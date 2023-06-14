package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import neu.edu.entity.ProductInventory;

public interface  ProductInventoryRepository extends JpaRepository<ProductInventory, Object>{
	
	List<ProductInventory> findAll();
	
	List<ProductInventory> findByDistributorId(Integer id);
	
//	@Query("SELECT p.id, p.name,cost,quantity,p.distributor_id, customer_location_id ,shipping_fee , standard_shipping_time\n"
//			+ "FROM distributor.product_inventory p\n"
//			+ "join shipment as s on p.distributor_id = s.distributor_id\n"
//			+ "join distributor d on p.distributor_id =  d.id\n"
//			+ "where customer_location_id = 7")
//	List<ProductInventory> findProduct(Integer locationid);

}
