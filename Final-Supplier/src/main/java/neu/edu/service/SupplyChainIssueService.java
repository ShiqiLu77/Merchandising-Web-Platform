package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.SupplyChainIssue;
import neu.edu.repository.SupplyChainIssueRepository;

@Service
public class SupplyChainIssueService {
	
	@Autowired
	private SupplyChainIssueRepository supplyChainIssueRepository;
	

	public List<SupplyChainIssue> viewAll() {
		
		return supplyChainIssueRepository.findAll();
	}

	public SupplyChainIssue viewSupplyChainIssueBySupplierId(Integer id) {
		
		return supplyChainIssueRepository.findBySupplierId(id);
	}

}
