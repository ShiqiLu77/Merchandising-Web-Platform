package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.ProductInventory;
import neu.edu.service.ProductInventoryService;


@CrossOrigin(value = {"http://localhost:8080","http://localhost:8081","http://localhost:8082"})
@RestController
@RequestMapping("/product")
public class ProductInventoryController {
	
	@Autowired
	private ProductInventoryService productService;


	@GetMapping("/view")
	public @ResponseBody List<ProductInventory> viewAll(){

		return productService.viewAll();
	}
	
	@GetMapping("/view/distributor/{id}")
	public @ResponseBody List<ProductInventory> viewProductInventoryByDistributorId(@PathVariable Integer id){
		return productService.viewProductInventoryByDistributorId(id);
	}
	
//	@GetMapping("/forcustomer/{id}")
//	public @ResponseBody List<ProductInventory> viewProductForCustomer(@PathVariable Integer locationId){
//		return productService.viewProductInventoryByDistributorId(locationId);
//	}
//	


	
}