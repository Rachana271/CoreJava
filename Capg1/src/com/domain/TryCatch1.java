package com.domain;

import java.util.Scanner;
public class TryCatch1 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("enter the value of a and b");
			a=sc.nextInt();
			b=sc.nextInt();
			int data=a/b;
			System.out.println("data value is" + data);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println("rest of the code....");
	}

}
