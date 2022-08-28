package com.tnsif.framework;

public interface BankFactory {
	public SavingsAcc getNewSavingsAccount(int accno ,String accnm,float accBal);
	public CurrentAcc getNewCurrentAccount(int accno, String accnm,float accBal);

}
