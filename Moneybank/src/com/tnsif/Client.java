package com.tnsif;
import com.tnsif.application.MMBankFactory;
import com.tnsif.application.MMSavingsAcc;
import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingsAcc;
public class Client {

	public static void main(String[] args) {
    BankFactory bf = new MMBankFactory();
    SavingsAcc sa = new MMSavingsAcc(123, "Rachana", 1000);
    sa.withdraw(500);
    CurrentAcc ca = new CurrentAcc(1234,"Thara",0);
    ca.withdraw(100);
    
	}

}