package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Supplier;
import neu.edu.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;
	

	public List<Supplier> viewAll() {
		
		return supplierRepository.findAll();
	}

	public Supplier viewSupplierById(Integer id) {
		
		return supplierRepository.findById(id);
	}

}
