package com.springbooth2data.AccountsRepository;
import org.springframework.data.repository.CrudRepository;

import com.springbooth2data.Accounts.Account;




	public interface AccountsRepository extends CrudRepository <Account, Integer> {
		
	}


