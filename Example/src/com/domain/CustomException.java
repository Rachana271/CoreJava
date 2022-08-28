package com.domain;
import java.util.Scanner;
public class CustomException {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter student id");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("Student found");
		}
		else
		{
			try
			{
				throw new StudentIdnotfound(id);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}





