package com.tnsif.application;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingsAcc;

public  class MMBankFactory implements BankFactory {

	@Override
	public SavingsAcc getNewSavingsAccount(int accno, String accnm,float accBal) {
		SavingsAcc sa= new SavingsAcc(accno,accnm,accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accnm,float accBal) {
		CurrentAcc ca = new CurrentAcc(accno,accnm,accBal);
		return ca;
	}

	
	

}
