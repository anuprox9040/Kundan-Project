package com.springbooth2data.Service.Transactionservice;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.springbooth2data.Repository.TransactionRepository;
import com.springbooth2data.Model.Customer;

public class TransactionServices {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	public List<Transaction> getAllTransaction()
	{
		List<Transaction> transaction=new ArrayList<Transaction>();
		transactionRepository.findAll().forEach(transaction1 ->transaction.add(transaction1));
		return transaction;
	}

	public Transaction getTransactionById(int transactionid) {
		// TODO Auto-generated method stub
		return null;
	}

}
