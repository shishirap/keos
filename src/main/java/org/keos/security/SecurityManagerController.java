package org.keos.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/securityManagerController")
public class SecurityManagerController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestParam("email") String user, @RequestParam("password") String password) {

		if (user == null && password == null) {
			// return "error";//"redirect:/dashboard/pages/dashboard.html";
			return new ResponseEntity<String>("bad", HttpStatus.BAD_REQUEST);
		}

		System.out.println("login : " + user);

		if (user.equals("shishira@gmail.com") && password.equals("abc")) {
			return new ResponseEntity<String>("success", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("bad request", HttpStatus.BAD_REQUEST);
		}
	}

}
