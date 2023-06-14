package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import neu.edu.entity.Supplier;
import neu.edu.service.SupplierService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping("/view")
	public @ResponseBody List<Supplier> viewAll(){
		return supplierService.viewAll();
	}


	@GetMapping("/view/supplier/{id}")
	public @ResponseBody Supplier viewSupplierById(@PathVariable Integer id){
		return supplierService.viewSupplierById(id);
	}

}
