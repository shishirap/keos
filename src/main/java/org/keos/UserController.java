package org.keos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	@RequestMapping(value="/getUserDetails", method=RequestMethod.GET)
	public ModelAndView getUserDetails(){
		System.out.println("*****************************************");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("useroutput");
		return mav;
	}

}