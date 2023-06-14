package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Material;
import neu.edu.service.MaterialService;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/material")
public class MaterialController {
	
	@Autowired
	private MaterialService materialService;


	@GetMapping("/view")
	public @ResponseBody List<Material> viewAll(){

		return materialService.viewAll();
	}
	
	@GetMapping("/view/supplier/{id}")
	public @ResponseBody List<Material> viewMaterialBySupplierId(@PathVariable Integer id){
		return materialService.viewMaterialBySupplierId(id);
	}
	


	
}