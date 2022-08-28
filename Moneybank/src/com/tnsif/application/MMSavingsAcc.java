package com.tnsif.application;

import com.tnsif.framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {

	public MMSavingsAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(float accBal) {
		System.out.println("you have saved this amount"+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingsAcc [toString()=" + super.toString() + ", isSalary()=" + isSalary() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
