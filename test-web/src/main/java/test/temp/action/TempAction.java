package test.temp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import test.model.entity.Customers;
import test.service.impl.CustomerService;

@Controller
@Scope(value = "prototype")
@RequestMapping("/Temp")
@CrossOrigin
public class TempAction {
		
	@Autowired
	CustomerService customerService; 
	
	
	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public void getCustomer(@RequestParam(required=true,value="id") Integer id,ModelMap modelMap) {
		
		if(id!=null) {
			Customers customer = customerService.findCustomer(id);
			modelMap.addAttribute(customer);
		}
		
	}
	
}
