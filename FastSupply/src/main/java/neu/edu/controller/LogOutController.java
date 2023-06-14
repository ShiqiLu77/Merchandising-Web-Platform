package neu.edu.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LogOutController {
	@RequestMapping(value= "/logout", method= RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request,HttpServletResponse response)
    {
     //清除session
     Enumeration<String> em = request.getSession().getAttributeNames();
     while(em.hasMoreElements()){
         request.getSession().removeAttribute(em.nextElement().toString());
     }
     request.getSession().invalidate();
     
     return new ModelAndView("login/logout");
     
    }
}
