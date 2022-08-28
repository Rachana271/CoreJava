package com.domain;

public class SynchronisedClass {
	int newbal;
	synchronized void deposit(int depamt)
	{
		System.out.println("Getting balance");
		int oldbalance=getBal();
		newbal=oldbalance+depamt;
		setBal(newbal);
	}
	int getBal()
	{
		return Accounts.Balance;	
	}
void setBal(int amt)
{
	try {
		Thread.sleep(2000);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	Accounts.Balance=newbal;
}
}
