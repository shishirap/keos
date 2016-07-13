package org.keos.dashboard;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dashBoardController")
public class DashBoardController {

	@RequestMapping(value = "/getDashBoardName", method = RequestMethod.GET)
	public ResponseEntity<?> getDashBoardName() {
		System.out.println("getDashBoardName #####################");
		// return "ADMIN";
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

	@RequestMapping(value = "/getDonutChartData", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody Map<String, Integer> getDonutChartData() {

		System.out.println(" ##################### getDonutChartData ##################### ");

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Download Sales", 20);
		m.put("Download Marketing", 40);
		m.put("Download Inbound", 20);
		m.put("Download Outbound", 10);
		m.put("Download Timer", 10);

		
		/*String s = "";
		JSONObject jsonObj = new JSONObject(s);*/
		
		/*
		 * List<JSONObject> entities = new ArrayList<JSONObject>();
		 * 
		 * JSONObject entity1 = new JSONObject(); entity1.put("label",
		 * "Download Sales"); entity1.put("value",12); entities.add(entity1);
		 */

		return m;
	}

}
