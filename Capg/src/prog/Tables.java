package prog;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		for( int i=1;i<=10;i++) //for loop
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		System.out.println("***");
		//while loop
		int i=1;
		while(i<=10){
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		System.out.println("****");
		//do while loop
		int  j=1;
		do{
			System.out.println(num+"*"+j+"="+num*j);
			j++;
		}
		while(j<=10);
		}
	}

	


