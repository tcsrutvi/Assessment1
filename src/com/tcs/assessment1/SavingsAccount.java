package com.tcs.assessment1;

import java.util.Date;

//balance, ownerName, createDate, Type, Status
public class SavingsAccount {
	
	private float balance;
	private String ownerName;
	private Date createDate;
	private TYPE type;
	private STATUS status;
	
	
	public SavingsAccount(float balance, String ownerName, Date createDate, TYPE type, STATUS status) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.createDate = createDate;
		this.type = type;
		this.status = status;
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
	public TYPE getType() {
		return type;
	}
	public STATUS getStatus() {
		return status;
	}
	

	
}
