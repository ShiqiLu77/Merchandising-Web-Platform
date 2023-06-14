package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.ManufactureManager;
import neu.edu.repository.ManufactureManagerRepository;

@Service
public class ManufactureManagerService {
	
	@Autowired
	private ManufactureManagerRepository manufactureManagerRepository;
	

	public List<ManufactureManager> viewAll() {
		
		return manufactureManagerRepository.findAll();
	}

	public List<ManufactureManager> viewManufactureManagerByManufactureId(Integer id) {
		
		return manufactureManagerRepository.findByManufactureId(id);
	}

	public ManufactureManager findManufactureManagerByUsername(String username) {
		
		return manufactureManagerRepository.findByUsername(username);

	}

}
