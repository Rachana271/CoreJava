package com.domain;

import com.domain.SynchronisedClass;

public class DepositThread extends Thread {
SynchronisedClass obj;
int amt;String msg;
public DepositThread(SynchronisedClass obj,int amt) {
	this.obj=obj;
	this.amt=amt;
}
@Override
public void run() {
	try {
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	 obj.deposit(amt);
}

}
