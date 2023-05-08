package com.cg.streamapi;

public class Bank {
	
	private String bname;
	private int bid;
	private long ifscCode;
	private double balance;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public long getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(long ifscCode) {
		this.ifscCode = ifscCode;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Transaction() {
		System.out.println("Transaction is successful");
	}
	

}
