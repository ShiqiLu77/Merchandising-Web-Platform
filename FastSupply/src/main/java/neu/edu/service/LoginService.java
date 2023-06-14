package neu.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import neu.edu.entity.customer.Customer;
import neu.edu.entity.distributor.DistributorManager;
import neu.edu.entity.manufacture.ManufactureManager;
import neu.edu.entity.supplier.SupplierManager;

@Service
public class LoginService {
	
	@Autowired
	private RestTemplate restTemplate;
	private final String pre = "http://localhost:";

	public Customer getCustomerByUsername(String username) {
		String suf = "8084/customer/username/" + username;
		String url = pre + suf;
		
		Customer customer = restTemplate.getForObject(url, Customer.class);
		return customer;
	}

	public SupplierManager getSupplierByUsername(String username) {
		String suf =  "8081/supplierManager/username/" + username;;
		String url = pre + suf;
		
		SupplierManager supplier = restTemplate.getForObject(url, SupplierManager.class);
		return supplier;
	}
	
	public ManufactureManager getManufactureByUsername(String username) {
		String suf =  "8082/manufactureManager/username/" + username;;
		String url = pre + suf;
		
		ManufactureManager manufacture = restTemplate.getForObject(url, ManufactureManager.class);
		return manufacture;
	}
	
	public DistributorManager getDistributorByUsername(String username) {
		String suf =  "8083/distributorManager/username/" + username;;
		String url = pre + suf;

		DistributorManager distributor = restTemplate.getForObject(url, DistributorManager.class);
		//System.out.print("get data:" + distributor.getDistributor().getId());
		return distributor;
	}

}
