package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.ProductInventory;
import neu.edu.repository.ProductInventoryRepository;

@Service
public class ProductInventoryService {
	
	@Autowired
	private ProductInventoryRepository productRepository;
	

	public List<ProductInventory> viewAll() {
		
		return productRepository.findAll();
	}

	public List<ProductInventory> viewProductInventoryByDistributorId(Integer id) {
		
		return productRepository.findByDistributorId(id);
	}
//
//	public List<ProductInventory> viewProductForCustomer(Integer locationId) {
//		
//		return productRepository.findProduct(locationId);
//	}

}
