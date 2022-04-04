package com.springbooth2data.Accounts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Account {
	@Id
	@Column
	private int Account_Id;
	
	@Column
	private String Account_Name;
	
	@Column
	private String Account_type;
	
	@Column
	private int Balance;
	
	public int getAccount_Id() {
		return Account_Id;
	}

	public void setAccount_Id(int account_Id) {
		Account_Id = account_Id;
	}

	public String getAccount_Name() {
		return Account_Name;
	}

	public void setAccount_Name(String account_Name) {
		Account_Name = account_Name;
	}

	public String getAccount_type() {
		return Account_type;
	}

	public void setAccount_type(String account_type) {
		Account_type = account_type;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}


}
