package neu.edu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.distributor.ProductInventory;
import neu.edu.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView viewDashboard(HttpSession session) {
		Integer customerId = (Integer) session.getAttribute("currentCustomerId");

		List<ProductInventory> products = customerService.getAllProductInventory(customerId);
		
		ModelAndView mv = new ModelAndView("customer/dashboard");
		mv.addObject("products", products);

		return mv;

	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public ModelAndView loginDashboard(HttpSession session) {
		Integer customerId = (Integer) session.getAttribute("currentCustomerId");
//
//		List<ProductInventory> products = customerService.getAllProductInventoryByCustomerId(customerId);
//		List<ShipmentD> shipments = customerService.getAllShipmentByCustomerId(customerId);
		
		ModelAndView mv = new ModelAndView("customer/dashboard");
//		mv.addObject("products", products);
//		mv.addObject("shipments", shipments);

		return mv;

	}

}
