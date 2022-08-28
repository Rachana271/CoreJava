package com.tnsif.application;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(float accBal) {
		System.out.println("you have spent"+accBal+"with"+CreditLimit);
	}

}
