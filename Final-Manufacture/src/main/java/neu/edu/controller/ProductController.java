package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Product;
import neu.edu.service.ProductService;


@CrossOrigin(value = {"http://localhost:8080","http://localhost:8081"})
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;


	@GetMapping("/view")
	public @ResponseBody List<Product> viewAll(){

		return productService.viewAll();
	}
	
	@GetMapping("/view/manufacture/{id}")
	public @ResponseBody List<Product> viewProductByManufactureId(@PathVariable Integer id){
		return productService.viewProductByManufactureId(id);
	}
	


	
}