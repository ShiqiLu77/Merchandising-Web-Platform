package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.SupplierManager;
import neu.edu.service.SupplierManagerService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/supplierManager")
public class SupplierManagerController {
	
	@Autowired
	private SupplierManagerService supplierManagerService;
	
	@GetMapping("/view")
	public @ResponseBody List<SupplierManager> viewAll(){
		return supplierManagerService.viewAll();
	}


	@GetMapping("/view/supplier/{id}")
	public @ResponseBody List<SupplierManager> viewSupplierManagerBySupplierId(@PathVariable Integer id){
		return supplierManagerService.viewSupplierManagerBySupplierId(id);
	}
	
	@GetMapping("/username/{username}")
	public @ResponseBody SupplierManager findSupplierManager(@PathVariable String username){
		
		return supplierManagerService.findSupplierManagerByUsername(username);
	}

}
