package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Shipment;
import neu.edu.repository.ShipmentRepository;

@Service
public class ShipmentService {
	
	@Autowired
	private ShipmentRepository shipmentRepository;
	

	public List<Shipment> viewAll() {
		
		return shipmentRepository.findAll();
	}

	public List<Shipment> viewShipmentByDistributorId(Integer id) {
		
		return shipmentRepository.findByDistributorId(id);
	}

}
