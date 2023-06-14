package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.DistributorManager;
import neu.edu.repository.DistributorManagerRepository;

@Service
public class DistributorManagerService {
	
	@Autowired
	private DistributorManagerRepository distributorManagerRepository;
	

	public List<DistributorManager> viewAll() {
		
		return distributorManagerRepository.findAll();
	}

	public List<DistributorManager> viewDistributorManagerByDistributorId(Integer id) {
		
		return distributorManagerRepository.findByDistributorId(id);
	}

	public DistributorManager findDistributorManagerByUsername(String username) {
		
		return distributorManagerRepository.findByUsername(username);

	}

}
