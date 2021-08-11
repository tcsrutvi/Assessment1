package com.tcs.assessment1;

import java.util.Date;

//balance, ownerName, createDate, Type, Status,overdraftBalance.
public class CurrentAccount {

	private float balance;
	private String ownerName;
	private Date createDate;
	private TYPE1 type;
	private STATUS status;
	private float overdraftBalance;
	
	
	public CurrentAccount(float balance, String ownerName, Date createDate, TYPE1 type, STATUS status, float overdraftBalance) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.createDate = createDate;
		this.type = type;
		this.status = status;
		this.overdraftBalance= overdraftBalance;
	}


	public float getBalance() {
		return balance;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public TYPE1 getType() {
		return type;
	}


	public STATUS getStatus() {
		return status;
	}
	
	public float getOverdraftBalance() {
		return overdraftBalance;
	}

	
	
	
	
}
