package neu.edu.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import neu.edu.entity.distributor.ProductInventory;
import neu.edu.entity.distributor.ShipmentD;
import neu.edu.entity.distributor.Distributor;
import neu.edu.entity.distributor.DistributorManager;
import neu.edu.entity.distributor.SupplyChainIssueD;

@Service
public class DistributorService {
	private final String pre = "http://localhost:8083/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<ProductInventory> getAllProductInventoryByDistributorId(Integer distributorId){
		String suf = "product/view/distributor/" +distributorId;
		String url = pre+suf;
	 
		ProductInventory[] materials = restTemplate.getForObject(url, ProductInventory[].class);	    
	    List<ProductInventory> materialsList = Arrays.asList(materials);
	    return  materialsList;	
	}

	public List<ShipmentD> getAllShipmentByDistributorId(Integer distributorId) {
		String suf = "shipment/view/distributor/" + distributorId;
		String url = pre+suf;
		
		ShipmentD[] shipments = restTemplate.getForObject(url, ShipmentD[].class);	    
	    List<ShipmentD> shipmentList = Arrays.asList(shipments);
	    return  shipmentList;	
	}

	public List<DistributorManager> getAllManagerByDistributorId(Integer distributorId) {
		String suf = "distributorManager/view/distributor/" + distributorId;
		String url = pre + suf;
		
		DistributorManager[] distributorManagers = restTemplate.getForObject(url, DistributorManager[].class);	    
	    List<DistributorManager> distributorManagerList = Arrays.asList(distributorManagers);
	    return  distributorManagerList;
	}

	public SupplyChainIssueD getSupplyChainIssueDByDistributorId(Integer distributorId) {
		String suf = "supplyChainIssue/view/distributor/" + distributorId;
		String url = pre + suf;
		
		SupplyChainIssueD supplyChainIssue = restTemplate.getForObject(url, SupplyChainIssueD.class);
		return supplyChainIssue;
	}

	public Distributor getDistributorByDistributorId(Integer distributorId) {
		String suf = "distributor/view/distributor/" + distributorId;
		String url = pre + suf;
		
		Distributor distributor = restTemplate.getForObject(url, Distributor.class);
		return distributor;
	}
}
