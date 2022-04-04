package com.springbooth2data.CustomerController;
import com.springbooth2data.Model.Customer;

import com.springbooth2data.CustomerService.CustomerServices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@RestController
public class CustomerController
{
	@Autowired
	CustomerServices customerServices;
	
	@GetMapping("/customer")
	private List<Customer> getAllCustomers()
	{
	return customerServices.getAllCustomers();
	}
	
	@GetMapping("/customer/{customerid}")
	private Customer getCustomer(@PathVariable("customerid") int customerid)
	{
		return customerServices.getCustomerById(customerid);
	}
	
	@DeleteMapping("/customer/{customerid}")
	private void deleteCustomer(@PathVariable("customerid") int customerid)
	{
		customerServices.delete(customerid);
	}
	
	@PostMapping("/customer")
	private int saveCustomer(@RequestBody Customer customer)
	{
		customerServices.saveOrUpdate(customer);
		return customer.getCustomer_id();
	}
	
	@PutMapping("/customer")
	private Customer update(@RequestBody Customer customer)
	{
		customerServices.saveOrUpdate(customer);
		return customer;
	}

}
