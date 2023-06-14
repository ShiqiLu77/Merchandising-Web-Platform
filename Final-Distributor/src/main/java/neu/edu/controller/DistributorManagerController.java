package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.DistributorManager;
import neu.edu.service.DistributorManagerService;


@CrossOrigin(value = {"http://localhost:8080","http://localhost:8081"})
@RestController
@RequestMapping("/distributorManager")
public class DistributorManagerController {
	
	@Autowired
	private DistributorManagerService distributorManagerService;


	@GetMapping("/view")
	public @ResponseBody List<DistributorManager> viewAll(){

		return distributorManagerService.viewAll();
	}
	
	@GetMapping("/view/distributor/{id}")
	public @ResponseBody List<DistributorManager> viewDistributorManagerByDistributorId(@PathVariable Integer id){
		return distributorManagerService.viewDistributorManagerByDistributorId(id);
	}

	@GetMapping("/username/{username}")
	public @ResponseBody DistributorManager findDistributorManager(@PathVariable String username){
		
		return distributorManagerService.findDistributorManagerByUsername(username);
	}

	
}