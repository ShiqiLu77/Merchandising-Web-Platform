package neu.edu.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Shipment;
import neu.edu.entity.SupplierManager;
import neu.edu.repository.ShipmentRepository;
import neu.edu.repository.SupplierManagerRepository;

@Service
public class SupplierManagerService {
	
	@Autowired
	private SupplierManagerRepository supplierManagerRepository;

	public List<SupplierManager> viewSupplierManagerBySupplierId(Integer id) {
		
		return supplierManagerRepository.findBySupplierId(id);
	}

	public List<SupplierManager> viewAll() {
		
		return supplierManagerRepository.findAll();
	}

	public SupplierManager findSupplierManagerByUsername(String username) {
		
		return supplierManagerRepository.findByUsername(username);
	}

}
