package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.DistributorManager;

public interface  DistributorManagerRepository extends JpaRepository<DistributorManager, Object>{
	
	List<DistributorManager> findAll();
	
	List<DistributorManager> findByDistributorId(Integer id);
	
	DistributorManager findByUsername(String username);
	

}
