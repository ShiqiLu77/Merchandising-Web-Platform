package neu.edu.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import neu.edu.entity.*;
import neu.edu.entity.distributor.ProductInventory;
import neu.edu.entity.supplier.Material;
import neu.edu.entity.supplier.Shipment;
import neu.edu.entity.supplier.Supplier;
import neu.edu.entity.supplier.SupplierManager;
import neu.edu.entity.supplier.SupplyChainIssue;

@Service
public class CustomerService {
	private final String pre = "http://localhost:8081/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Material> getAllMaterialBySupplierId(Integer supplierId){
		String suf = "material/view/supplier/" +supplierId;
		String url = pre+suf;
	 
		Material[] materials = restTemplate.getForObject(url, Material[].class);	    
	    List<Material> materialsList = Arrays.asList(materials);
	    return  materialsList;	
	}

	public List<Shipment> getAllShipmentBySupplierId(Integer supplierId) {
		String suf = "shipment/view/supplier/" + supplierId;
		String url = pre+suf;
		
		Shipment[] shipments = restTemplate.getForObject(url, Shipment[].class);	    
	    List<Shipment> shipmentList = Arrays.asList(shipments);
	    return  shipmentList;	
	}

	public List<SupplierManager> getAllManagerBySupplierId(Integer supplierId) {
		String suf = "supplierManager/view/supplier/" + supplierId;
		String url = pre + suf;
		
		SupplierManager[] supplierManagers = restTemplate.getForObject(url, SupplierManager[].class);	    
	    List<SupplierManager> supplierManagerList = Arrays.asList(supplierManagers);
	    return  supplierManagerList;
	}

	public SupplyChainIssue getSupplyChainIssueBySupplierId(Integer supplierId) {
		String suf = "supplyChainIssue/view/supplier/" + supplierId;
		String url = pre + suf;
		
		SupplyChainIssue supplyChainIssue = restTemplate.getForObject(url, SupplyChainIssue.class);
		return supplyChainIssue;
	}

	public Supplier getSupplierBySupplierId(Integer supplierId) {
		String suf = "supplier/view/supplier/" + supplierId;
		String url = pre + suf;
		
		Supplier supplier = restTemplate.getForObject(url, Supplier.class);
		return supplier;
	}

	public List<ProductInventory> getAllProductInventory(Integer customerId) {
		String url ="http://localhost:8083/product/view";
		
		ProductInventory[] products = restTemplate.getForObject(url, ProductInventory[].class);	    
	    List<ProductInventory> productsList = Arrays.asList(products);
		return productsList ;
	}
}
