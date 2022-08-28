package com.tnsif.framework;

public class CurrentAcc extends BankAcc {
protected float CreditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
	CreditLimit = creditLimit;
}

	public float getCreditLimit() {
		return CreditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		CreditLimit = creditLimit;
	}

	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

}
