package com.springbooth2data.TransactionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.springbooth2data.Service.Transactionservice.TransactionServices;
import com.springbooth2data.Model.Customer;
import javax.transaction.Transaction;
import java.util.List;
@RestController
public class TransactionController {
	
	@Autowired
	TransactionServices transactionServices;
	
	@GetMapping("/transaction")
	private List<Transaction> getAllTransactions()
	{
		return transactionServices.getAllTransaction();
	}
	
	@GetMapping("/transaction/{transactionid}")
	private Transaction getTransaction(@PathVariable("transactionid") int transactionid)
	{
		return transactionServices.getTransactionById(transactionid);
	}
	

}
