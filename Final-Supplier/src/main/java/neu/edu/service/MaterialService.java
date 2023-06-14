package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Material;
import neu.edu.repository.MaterialRepository;

@Service
public class MaterialService {
	
	@Autowired
	private MaterialRepository materialRepository;
	

	public List<Material> viewAll() {
		
		return materialRepository.findAll();
	}

	public List<Material> viewMaterialBySupplierId(Integer id) {
		
		return materialRepository.findBySupplierId(id);
	}

}
