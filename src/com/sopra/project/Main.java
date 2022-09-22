package com.sopra.project;

public class Main 
{
	private double balance=600;
	
	public double deposit(double amount)
	{
		
		
		balance+=amount;
		return balance;
	}
	public double withdraw(double amt)
	{
		
		balance-=amt;
		return balance;
	}
	public double display()
	{
		return balance;
	}

	
	public static void main(String[] args)
	{
		System.out.println("Accno:1234");
		System.out.println("Accholdername:Nithu");
		Main m = new Main();
		System.out.println("After Deposit"+m.deposit(200));
		System.out.println("After withdraw"+m.withdraw(100));
		System.out.println("Final balance"+ m.display());
	}

}
