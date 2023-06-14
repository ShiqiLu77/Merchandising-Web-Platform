package neu.edu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.customer.Customer;
import neu.edu.entity.distributor.DistributorManager;
import neu.edu.entity.manufacture.ManufactureManager;
import neu.edu.entity.supplier.SupplierManager;
import neu.edu.model.LoginInformation;
import neu.edu.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/CustomerLogin", method = RequestMethod.GET)
	public ModelAndView getCustomerLoginPage() {
		
		return new ModelAndView("login/customerLogin");
	}
	

	@RequestMapping(value = "/CustomerLogin", method = RequestMethod.POST)
	public String postCustomerDashborad(LoginInformation loginInformation,HttpSession session) {
		String username = loginInformation.getUsername();
		String password = loginInformation.getPassword();
		System.out.print(username);
		
		Customer customer = loginService.getCustomerByUsername(username);
		if (password.equals(customer.getPassword())) {
			session.setAttribute("currentCustomerUsername", username);
			return "redirect:/customer/dashboard";
		}else {
			return "redirect:/CustomerLogin";
		}
	}
	
	
	@RequestMapping(value = "/SupplierLogin", method = RequestMethod.GET)
	public ModelAndView getSupplierLoginPage() {
		
		return new ModelAndView("login/supplierLogin");
	}
	
	@RequestMapping(value = "/SupplierLogin", method = RequestMethod.POST)
	public String postSupplierDashborad(LoginInformation loginInformation,HttpSession session) {
		String username = loginInformation.getUsername();
		String password = loginInformation.getPassword();
		
		SupplierManager supplier = loginService.getSupplierByUsername(username);
		if (password.equals(supplier.getPassword())) {
			session.setAttribute("currentSupplierId", supplier.getSupplier().getId());
			return "redirect:/supplier/dashboard";
		}else {
			return "redirect:/SupplierLogin";
		}	
	}
	
	@RequestMapping(value = "/ManufactureLogin", method = RequestMethod.GET)
	public ModelAndView getManufactureLoginPage() {
		
		return new ModelAndView("login/manufactureLogin");
	}
	
	@RequestMapping(value = "/ManufactureLogin", method = RequestMethod.POST)
	public String postManufactureDashborad(LoginInformation loginInformation,HttpSession session) {
		String username = loginInformation.getUsername();
		String password = loginInformation.getPassword();
		
		ManufactureManager manufacture = loginService.getManufactureByUsername(username);
		if (password.equals(manufacture.getPassword())) {
			session.setAttribute("currentManufactureId", manufacture.getManufacture().getId());
			return "redirect:/manufacture/dashboard";
		}else {
			return "redirect:/manufacture";
		}	
	}
	
	@RequestMapping(value = "/DistributorLogin", method = RequestMethod.GET)
	public ModelAndView getDistributorLoginPage() {
		
		return new ModelAndView("login/distributorLogin");
	}

	@RequestMapping(value = "/DistributorLogin", method = RequestMethod.POST)
	public String postDistributorDashborad(LoginInformation loginInformation , HttpSession session) {
        String username = loginInformation.getUsername();
        String password = loginInformation.getPassword();
        System.out.print("get data1:" + username);
        DistributorManager distributor = loginService.getDistributorByUsername(username);
        if (password.equals(distributor.getPassword())) {
            session.setAttribute("currentDistributorId", distributor.getDistributor().getId());
            return "redirect:/distributor/dashboard";
        }else {
            return "redirect:/distributor";
        }   
		
	}
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public ModelAndView getLogoutPage() {
		
		return new ModelAndView("index");
		
	}
}