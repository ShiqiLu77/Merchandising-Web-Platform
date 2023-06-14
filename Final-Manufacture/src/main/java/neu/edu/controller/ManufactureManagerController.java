package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.ManufactureManager;
import neu.edu.service.ManufactureManagerService;


@CrossOrigin(value = {"http://localhost:8080","http://localhost:8081"})
@RestController
@RequestMapping("/manufactureManager")
public class ManufactureManagerController {
	
	@Autowired
	private ManufactureManagerService manufactureManagerService;


	@GetMapping("/view")
	public @ResponseBody List<ManufactureManager> viewAll(){

		return manufactureManagerService.viewAll();
	}
	
	@GetMapping("/view/manufacture/{id}")
	public @ResponseBody List<ManufactureManager> viewManufactureManagerByManufactureId(@PathVariable Integer id){
		return manufactureManagerService.viewManufactureManagerByManufactureId(id);
	}

	@GetMapping("/username/{username}")
	public @ResponseBody ManufactureManager findManufactureManager(@PathVariable String username){
		
		return manufactureManagerService.findManufactureManagerByUsername(username);
	}

	
}