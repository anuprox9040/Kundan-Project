package com.springbooth2data.CustomerService;
import com.springbooth2data.CustomerRepository.CustomerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.springbooth2data.Model.Customer;

public class CustomerServices {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> customer=new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer1 ->customer.add(customer1));
		return customer;
	}
	public Customer getCustomerById(int id)
	{
		return customerRepository.findById(id).get();
	}
	public void saveOrUpdate(Customer customer)
	{
		customerRepository.save(customer);
	}
	public void delete(int id)
	{
		customerRepository.deleteById(id);
	}
	
	public void update(Customer customer,int Customer_id)
	{
		customerRepository.save(customer);
	}
	

}
