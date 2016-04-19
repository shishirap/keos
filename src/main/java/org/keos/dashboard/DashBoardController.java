package org.keos.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dashBoardController")
public class DashBoardController {
	
	@RequestMapping(value="/getDashBoardName", method=RequestMethod.GET)
	public String getDashBoardName(){
		System.out.println("getDashBoardName #####################");
		return "ADMIN";
	}

}
