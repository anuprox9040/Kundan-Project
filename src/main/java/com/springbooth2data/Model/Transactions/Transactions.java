package com.springbooth2data.Model.Transactions;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table
public class Transactions {
	@Id
	@Column
	private int Transaction_Id;
	
	@Column
	private int Account_Id;
	
	@Column
	private String Transfer_Type;
	
	@Column
	private String Transaction_Date;
	
	@Column
	private String Transaction_DoneBy;

	public int getTransaction_Id() {
		return Transaction_Id;
	}

	public void setTransaction_Id(int transaction_Id) {
		Transaction_Id = transaction_Id;
	}

	public int getAccount_Id() {
		return Account_Id;
	}

	public void setAccount_Id(int account_Id) {
		Account_Id = account_Id;
	}

	public String getTransfer_Type() {
		return Transfer_Type;
	}

	public void setTransfer_Type(String transfer_Type) {
		Transfer_Type = transfer_Type;
	}

	public String getTransaction_Date() {
		return Transaction_Date;
	}

	public void setTransaction_Date(String transaction_Date) {
		Transaction_Date = transaction_Date;
	}

	public String getTransaction_DoneBy() {
		return Transaction_DoneBy;
	}

	public void setTransaction_DoneBy(String transaction_DoneBy) {
		Transaction_DoneBy = transaction_DoneBy;
	}

}
