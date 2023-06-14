package neu.edu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.manufacture.ShipmentM;
import neu.edu.entity.manufacture.Manufacture;
import neu.edu.entity.manufacture.ManufactureManager;
import neu.edu.entity.manufacture.Product;
import neu.edu.entity.manufacture.SupplyChainIssueM;
import neu.edu.service.ManufactureService;

@Controller
@RequestMapping("/manufacture")
public class ManufactureController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ManufactureService manufactureService;

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView viewDashboard(HttpSession session) {
		Integer manufactureId = (Integer) session.getAttribute("currentManufactureId");
		
		List<Product> products = manufactureService.getAllProductByManufactureId(manufactureId);
		List<ShipmentM> shipments = manufactureService.getAllShipmentByManufactureId(manufactureId);

		ModelAndView mv = new ModelAndView("manufacture/dashboard");
		mv.addObject("products", products);
		mv.addObject("shipments", shipments);

		return mv;

	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public ModelAndView loginDashboard(HttpSession session) {
		Integer manufactureId = (Integer) session.getAttribute("currentManufactureId");
		
		List<Product> products = manufactureService.getAllProductByManufactureId(manufactureId);
		List<ShipmentM> shipments = manufactureService.getAllShipmentByManufactureId(manufactureId);

		ModelAndView mv = new ModelAndView("manufacture/dashboard");
		mv.addObject("products", products);
		mv.addObject("shipments", shipments);

		return mv;

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView viewProducts(HttpSession session) {
		Integer manufactureId = (Integer) session.getAttribute("currentManufactureId");

		List<Product> products = manufactureService.getAllProductByManufactureId(manufactureId);
		ModelAndView mv = new ModelAndView("manufacture/product");
		mv.addObject("products", products);

		return mv;
	}

	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ModelAndView vieOrders(HttpSession session) {

		return new ModelAndView("manufacture/orders", "", null);
	}

	@RequestMapping(value = "/group", method = RequestMethod.GET)
	public ModelAndView viewGroup(HttpSession session) {
		Integer manufactureId = (Integer) session.getAttribute("currentManufactureId");
		List<ManufactureManager> managers = manufactureService.getAllManagerByManufactureId(manufactureId);

		ModelAndView mv = new ModelAndView("manufacture/group");
		mv.addObject("managers", managers);

		return mv;
	}

	@RequestMapping(value = "/myInfo", method = RequestMethod.GET)
	public ModelAndView viewMyInfo(HttpSession session) {
		Integer manufactureId = (Integer) session.getAttribute("currentManufactureId");

//		manufactureId = 3;
//
//		Manufacture manufacture = manufactureService.getManufactureByManufactureId(manufactureId);

		ModelAndView mv = new ModelAndView("manufacture/myInfo");
//		mv.addObject("manufacture", manufacture);

		return mv;
	}

	@RequestMapping(value = "/supplyChain", method = RequestMethod.GET)
	public ModelAndView viewSupplyChain(HttpSession session) {
		Integer manufactureId = (Integer) session.getAttribute("currentManufactureId");

//		manufactureId = 3;
//
//		SupplyChainIssueM supplyChainIssue = manufactureService.getSupplyChainIssueMByManufactureId(manufactureId);
//		List<ShipmentM> shipments = manufactureService.getAllShipmentByManufactureId(manufactureId);

		ModelAndView mv = new ModelAndView("manufacture/supplyChain");
//		mv.addObject("supplyChainIssue", supplyChainIssue);
//		mv.addObject("shipments", shipments);

		return mv;
	}

}
