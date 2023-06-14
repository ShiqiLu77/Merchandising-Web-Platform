package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import neu.edu.entity.SupplyChainIssue;
import neu.edu.service.SupplyChainIssueService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/supplyChainIssue")
public class SupplyChainIssueController {
	
	@Autowired
	private SupplyChainIssueService supplyChainIssueService;
	
	@GetMapping("/view")
	public @ResponseBody List<SupplyChainIssue> viewAll(){
		return supplyChainIssueService.viewAll();
	}


	@GetMapping("/view/supplier/{id}")
	public @ResponseBody SupplyChainIssue viewSupplyChainIssueBySupplierId(@PathVariable Integer id){
		return supplyChainIssueService.viewSupplyChainIssueBySupplierId(id);
	}

}
