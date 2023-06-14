package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Shipment;
import neu.edu.service.ShipmentService;


@CrossOrigin(value = {"http://localhost:8080","http://localhost:8081","http://localhost:8081"})
@RestController
@RequestMapping("/shipment")
public class ShipmentController {
	
	@Autowired
	private ShipmentService shipmentService;


	@GetMapping("/view")
	public @ResponseBody List<Shipment> viewAll(){

		return shipmentService.viewAll();
	}
	
	@GetMapping("/view/distributor/{id}")
	public @ResponseBody List<Shipment> viewShipmentByDistributorId(@PathVariable Integer id){
		return shipmentService.viewShipmentByDistributorId(id);
	}
	


	
}