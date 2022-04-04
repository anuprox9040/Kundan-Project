package com.springbooth2data.CustomerRepository;
import org.springframework.data.repository.CrudRepository;

import com.springbooth2data.Model.Customer;


	public interface CustomerRepository extends CrudRepository <Customer, Integer> {
		
	}


