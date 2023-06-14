package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Product;
import neu.edu.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	

	public List<Product> viewAll() {
		
		return productRepository.findAll();
	}

	public List<Product> viewProductByManufactureId(Integer id) {
		
		return productRepository.findByManufactureId(id);
	}

}
