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

	public List<Shipment> viewShippingBySupplierId(Integer id) {
		
		return shipmentRepository.findBySupplierId(id);
	}

	public List<Shipment> viewAllShipment() {
		
		return shipmentRepository.findAll();
	}
}
