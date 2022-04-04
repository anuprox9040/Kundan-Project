package com.springbooth2data.AccountsController;

import com.springbooth2data.Accounts.Account;
import com.springbooth2data.AccountsService.AccountsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController{
	
	@Autowired
	AccountsService accountServices;
	
	@GetMapping("/account")
	private List<Account> getAllAccounts()
	{
	return accountServices.getAllAccounts();
	}
	@GetMapping("/account/{accountid}")
	private Account getAccount(@PathVariable("accountid") int accountid)
	{
		return accountServices.getAccountById(accountid);
	}
	@DeleteMapping("/account/{accountid}")
	private void deleteaccount(@PathVariable("accountid") int accountid)
	{
		accountServices.delete(accountid);
	}
	@PostMapping("/account")
	private int saveAccount(@RequestBody Account account)
	{
		accountServices.saveOrUpdate(account);
		return account.getAccount_Id();
	}
	@PutMapping("/account")
	private Account update(@RequestBody Account account)
	{
		accountServices.saveOrUpdate(account);
		return account;
	}


}
