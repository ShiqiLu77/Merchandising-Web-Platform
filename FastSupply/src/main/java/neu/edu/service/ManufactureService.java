package neu.edu.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import neu.edu.entity.manufacture.Product;
import neu.edu.entity.manufacture.ShipmentM;
import neu.edu.entity.manufacture.Manufacture;
import neu.edu.entity.manufacture.ManufactureManager;
import neu.edu.entity.manufacture.SupplyChainIssueM;

@Service
public class ManufactureService {
	private final String pre = "http://localhost:8082/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Product> getAllProductByManufactureId(Integer manufactureId){
		String suf = "product/view/manufacture/" +manufactureId;
		String url = pre+suf;
	 
		Product[] products = restTemplate.getForObject(url, Product[].class);	    
	    List<Product> productsList = Arrays.asList(products);
	    return  productsList;	
	}

	public List<ShipmentM> getAllShipmentByManufactureId(Integer manufactureId) {
		String suf = "shipment/view/manufacture/" + manufactureId;
		String url = pre+suf;
		
		ShipmentM[] shipments = restTemplate.getForObject(url, ShipmentM[].class);	    
	    List<ShipmentM> shipmentList = Arrays.asList(shipments);
	    return  shipmentList;	
	}

	public List<ManufactureManager> getAllManagerByManufactureId(Integer manufactureId) {
		String suf = "manufactureManager/view/manufacture/" + manufactureId;
		String url = pre + suf;
		
		ManufactureManager[] manufactureManagers = restTemplate.getForObject(url, ManufactureManager[].class);	    
	    List<ManufactureManager> manufactureManagerList = Arrays.asList(manufactureManagers);
	    return  manufactureManagerList;
	}

	public SupplyChainIssueM getSupplyChainIssueMByManufactureId(Integer manufactureId) {
		String suf = "supplyChainIssue/view/manufacture/" + manufactureId;
		String url = pre + suf;
		
		SupplyChainIssueM supplyChainIssue = restTemplate.getForObject(url, SupplyChainIssueM.class);
		return supplyChainIssue;
	}

	public Manufacture getManufactureByManufactureId(Integer manufactureId) {
		String suf = "manufacture/view/manufacture/" + manufactureId;
		String url = pre + suf;
		
		Manufacture manufacture = restTemplate.getForObject(url, Manufacture.class);
		return manufacture;
	}
}
