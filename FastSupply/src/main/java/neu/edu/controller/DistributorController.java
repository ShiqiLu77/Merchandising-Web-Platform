package neu.edu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.distributor.ProductInventory;
import neu.edu.entity.distributor.ShipmentD;
import neu.edu.entity.distributor.Distributor;
import neu.edu.entity.distributor.DistributorManager;
import neu.edu.entity.distributor.SupplyChainIssueD;
import neu.edu.service.DistributorService;

@Controller
@RequestMapping("/distributor")
public class DistributorController {

	@Autowired
	private DistributorService distributorService;

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView viewDashboard(HttpSession session) {
		Integer distributorId = (Integer) session.getAttribute("currentDistributorId");

		List<ProductInventory> products = distributorService.getAllProductInventoryByDistributorId(distributorId);
		List<ShipmentD> shipments = distributorService.getAllShipmentByDistributorId(distributorId);
		
		ModelAndView mv = new ModelAndView("distributor/dashboard");
		mv.addObject("products", products);
		mv.addObject("shipments", shipments);

		return mv;

	}
	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public ModelAndView loginDashboard(HttpSession session) {
		Integer distributorId = (Integer) session.getAttribute("currentDistributorId");

		List<ProductInventory> products = distributorService.getAllProductInventoryByDistributorId(distributorId);
		List<ShipmentD> shipments = distributorService.getAllShipmentByDistributorId(distributorId);
		
		ModelAndView mv = new ModelAndView("distributor/dashboard");
		mv.addObject("products", products);
		mv.addObject("shipments", shipments);

		return mv;

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView viewProductInventorys(HttpSession session) {

		Integer distributorId = (Integer) session.getAttribute("currentDistributorId");

		List<ProductInventory> products = distributorService.getAllProductInventoryByDistributorId(distributorId);

		ModelAndView mv = new ModelAndView("distributor/product");
		mv.addObject("products", products);

		return mv;
	}

	@RequestMapping(value = "/ordersfrom", method = RequestMethod.GET)
	public ModelAndView vieOrders(HttpSession session) {

		return new ModelAndView("distributor/ordersfrom", "", null);
	}
	
	@RequestMapping(value = "/myorders", method = RequestMethod.GET)
	public ModelAndView viewMyOrders(HttpSession session) {
//		distributorId = 1;
//
//		List<DistributorManager> managers = distributorService.getAllManagerByDistributorId(distributorId);

		ModelAndView mv = new ModelAndView("distributor/myorders");
//		mv.addObject("managers", managers);

		return mv;
	}

	@RequestMapping(value = "/group", method = RequestMethod.GET)
	public ModelAndView viewGroup(HttpSession session) {
//		distributorId = 1;
//
//		List<DistributorManager> managers = distributorService.getAllManagerByDistributorId(distributorId);

		ModelAndView mv = new ModelAndView("distributor/group");
//		mv.addObject("managers", managers);

		return mv;
	}

	@RequestMapping(value = "/myInfo", method = RequestMethod.GET)
	public ModelAndView viewMyInfo(HttpSession session) {

//		Integer distributorId = (Integer) session.getAttribute("currentDistributorId");
//
//		Distributor distributor = distributorService.getDistributorByDistributorId(distributorId);

		ModelAndView mv = new ModelAndView("distributor/myInfo");
//		mv.addObject("distributor", distributor);

		return mv;
	}

	@RequestMapping(value = "/supplyChain", method = RequestMethod.GET)
	public ModelAndView viewSupplyChain(HttpSession session) {

//		Integer distributorId = (Integer) session.getAttribute("currentDistributorId");
//
//		SupplyChainIssueM supplyChainIssue = distributorService.getSupplyChainIssueMByDistributorId(distributorId);
//		List<ShipmentD> shipments = distributorService.getAllShipmentByDistributorId(distributorId);

		ModelAndView mv = new ModelAndView("distributor/supplyChain");
//		mv.addObject("supplyChainIssue", supplyChainIssue);
//		mv.addObject("shipments", shipments);

		return mv;
	}

}
