package neu.edu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.controller.model.UserModel;
import neu.edu.service.UserService;

@Controller
@RequestMapping("/customer")
public class UserController {
	
//	@Autowired
//	private UserService userService;
//	
	@RequestMapping(value="/view", method = RequestMethod.GET)
	public ModelAndView viewUsers() {
		
//		List<UserModel> userModels = userService.getAllUsers();
		List<UserModel> userModels = null;
		
		return new ModelAndView("users/viewUsers","userModel",userModels);
	}
	
//	@RequestMapping(value="/address", method = RequestMethod.GET)
//	public ModelAndView  createAddress() {
//		System.out.println("/Address");
//		userService.createAddress("ashwin2", null);
//		
//		return new ModelAndView("users/viewUsers");
//	}
//	
//	@RequestMapping(value="/save", method = RequestMethod.POST)
//	public ModelAndView createUsers(@Valid @ModelAttribute UserModel userModel ,BindingResult result) {
//	
//			if(result.hasErrors()) {
//				
//			}else {
//				
//			}
//		userService.saveUser(userModel);
//		return new ModelAndView("users/viewUsers","userModel",false);
//	}

}
