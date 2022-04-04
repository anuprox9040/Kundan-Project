package com.springbooth2data.Repository;
import org.springframework.data.repository.CrudRepository;
import com.springbooth2data.Model.Transactions.Transactions;

public interface TransactionRepository extends CrudRepository <Transactions, Integer>{

}
