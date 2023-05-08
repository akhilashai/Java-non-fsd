package com.cg.streamapi;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Account extends Bank {
	
	Scanner scan = new Scanner(System.in);
	List<Bank> holders = new ArrayList<>();
	private String accountType;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void Create(Bank b)
	{
		System.out.println("Enter BankName");
		b.setBname(scan.next());
		System.out.println("Enter Ifsc code");
		b.setIfscCode(scan.nextLong());
		int id = (int)(Math.random()*100);
		b.setBid(id);
		System.out.println("Enter Balance");
		b.setBalance(scan.nextDouble());
		System.out.println("Enter Account Type");
		setAccountType(scan.next());
	}

}
