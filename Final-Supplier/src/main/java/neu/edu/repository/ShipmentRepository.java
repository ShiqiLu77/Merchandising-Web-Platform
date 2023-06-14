package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Shipment;

public interface  ShipmentRepository extends JpaRepository<Shipment, Object>{
	
	List<Shipment> findBySupplierId(Integer id);
	
	List<Shipment> findAll();
}
