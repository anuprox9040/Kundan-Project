package com.springbooth2data.AccountsService;
import java.util.ArrayList;
import java.util.List;
import com.springbooth2data.Accounts.Account;
import org.springframework.beans.factory.annotation.Autowired;
import com.springbooth2data.AccountsRepository.AccountsRepository;

public class AccountsService {
	@Autowired
	AccountsRepository accountsRepository;
	
	public List<Account> getAllAccounts()
	{
		List<Account> account=new ArrayList<Account>();
		accountsRepository.findAll().forEach(account1 ->account.add(account1));
		return account;
	}
	public Account getAccountById(int id)
	{
		return accountsRepository.findById(id).get();
	}
	public void saveOrUpdate(Account account)
	{
		accountsRepository.save(account);
	}
	public void delete(int id)
	{
		accountsRepository.deleteById(id);
	}
	
	public void update(Account account,int Account_Id)
	{
		accountsRepository.save(account);
	}
	

}


