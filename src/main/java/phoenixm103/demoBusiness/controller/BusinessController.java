package phoenixm103.demoBusiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 

import phoenixm103.demoBusiness.service.BusinessLogic;
@RestController
public class BusinessController {
	
	@Autowired
	private BusinessLogic businessLogic;
	
	@RequestMapping(method=RequestMethod.GET, value = "/tests")
	public String getInfoByNid() {
		return businessLogic.getInfoByNid();
		
	}
	
}
