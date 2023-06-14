package neu.edu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.supplier.Material;
import neu.edu.entity.supplier.Shipment;
import neu.edu.entity.supplier.Supplier;
import neu.edu.entity.supplier.SupplierManager;
import neu.edu.entity.supplier.SupplyChainIssue;
import neu.edu.service.SupplierService;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private SupplierService supplierService;

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView viewDashboard(HttpSession session) {
		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		List<Material> materials = supplierService.getAllMaterialBySupplierId(supplierId);
		List<Shipment> shipments = supplierService.getAllShipmentBySupplierId(supplierId);

		ModelAndView mv = new ModelAndView("supplier/dashboard");
		mv.addObject("materials", materials);
		mv.addObject("shipments", shipments);

		return mv;

	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public ModelAndView loginDashboard(HttpSession session) {
		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		List<Material> materials = supplierService.getAllMaterialBySupplierId(supplierId);
		List<Shipment> shipments = supplierService.getAllShipmentBySupplierId(supplierId);

		ModelAndView mv = new ModelAndView("supplier/dashboard");
		mv.addObject("materials", materials);
		mv.addObject("shipments", shipments);

		return mv;

	}

	@RequestMapping(value = "/material", method = RequestMethod.GET)
	public ModelAndView viewMaterials(HttpSession session) {

		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		List<Material> materials = supplierService.getAllMaterialBySupplierId(supplierId);

		ModelAndView mv = new ModelAndView("supplier/material");
		mv.addObject("materials", materials);

		return mv;
	}

	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ModelAndView vieOrders(HttpSession session) {
		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		return new ModelAndView("supplier/orders", "", null);
	}

	@RequestMapping(value = "/group", method = RequestMethod.GET)
	public ModelAndView viewGroup(HttpSession session) {
		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		List<SupplierManager> managers = supplierService.getAllManagerBySupplierId(supplierId);

		ModelAndView mv = new ModelAndView("supplier/group");
		mv.addObject("managers", managers);

		return mv;
	}

	@RequestMapping(value = "/myInfo", method = RequestMethod.GET)
	public ModelAndView viewMyInfo(HttpSession session) {

		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		Supplier supplier = supplierService.getSupplierBySupplierId(supplierId);

		ModelAndView mv = new ModelAndView("supplier/myInfo");
		mv.addObject("supplier", supplier);

		return mv;
	}

	@RequestMapping(value = "/supplyChain", method = RequestMethod.GET)
	public ModelAndView viewSupplyChain(HttpSession session) {

		Integer supplierId = (Integer) session.getAttribute("currentSupplierId");

		SupplyChainIssue supplyChainIssue = supplierService.getSupplyChainIssueBySupplierId(supplierId);
		List<Shipment> shipments = supplierService.getAllShipmentBySupplierId(supplierId);

		ModelAndView mv = new ModelAndView("supplier/supplyChain");
		mv.addObject("supplyChainIssue", supplyChainIssue);
		mv.addObject("shipments", shipments);

		return mv;
	}

}
