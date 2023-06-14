package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.SupplyChainIssue;

public interface  SupplyChainIssueRepository extends JpaRepository<SupplyChainIssue, Object>{
	
	List<SupplyChainIssue> findAll();
	
	SupplyChainIssue findBySupplierId(Integer id);
	

}
