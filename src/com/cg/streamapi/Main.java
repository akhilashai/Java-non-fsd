package com.cg.streamapi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Account ac = new Account();
		Atm atm = new Atm();
		Bank b = new Bank();
		
		
		
		for(;;)
		{
			while(true)
			{
				System.out.println("1. Create Account");
				System.out.println("2. Withdraw");
				System.out.println("3. exit");
				int choice = scan.nextInt();
				switch(choice)
				{
				case 1:
					ac.Create(b);
					break;
				
					
				case 2:
					System.out.println("Enter amount you want to withdraw");
					double amount = scan.nextDouble();
					double total = atm.withdraw(b,amount);
					System.out.println("Total Balance : " +b.getBalance());
					break;
				case 3:
					System.exit(0);
					
				}
			}
		}

	}

}
