package com.cg.streamapi;

public class Atm extends Bank{
	
	public double withdraw(Bank bank, double amount)
	{
		//Bank bank = new Bank();
		double balance = bank.getBalance()-amount;
		bank.setBalance(bank.getBalance()-amount);
		//System.out.println(bank.getBalance());
		return bank.getBalance();
		
		
		
	}
	

}
