package com.shiwang.spring.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shiwang.spring.entity.Customer;
import com.shiwang.spring.service.CustomerService;

@Controller
@RequestMapping("/Main")
public class MainController {
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/home")
	public String loadHome(Model model) {
		
		List<Customer> customersList=customerservice.getCustomers();
		model.addAttribute("customers", customersList);
		return "Homepage";
	}
	
	@GetMapping("/AddCustomerForm")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("Customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String addCustomer(@ModelAttribute("Customer") Customer customer) {
		
		customerservice.addCustomer(customer);
		return "redirect:/Main/home";
	}
	
	@GetMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("customerId") int id, Model model) {
		
		Customer customerwithid=customerservice.getCustomer(id);
		model.addAttribute("Customer",customerwithid);
		return "customer-form";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		
		customerservice.deleteCustomer(id);
		return "redirect:/Main/home";
	}

	@GetMapping("/helloworld")
	public String deleteCustomer() {
		
		return "Hello World!!";
	}
	
}
