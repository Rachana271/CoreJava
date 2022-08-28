package com.tnsif.framework;

public class SavingsAcc extends BankAcc {
public SavingsAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

private boolean isSalary;

@Override
public String toString() {
	return "SavingsAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

public boolean isSalary() {
	return isSalary;
}

public void setSalary(boolean isSalary) {
	this.isSalary = isSalary;
}

}
