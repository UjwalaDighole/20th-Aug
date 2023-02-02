package logical;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
//		int a=10;
//		int b=2;
//		
//		int mul=a*b;
//		System.out.println(mul);

		//scanner--> java--> util
		Scanner sc=new Scanner(System.in);
	
		//name-->string
		//char
		//num--> decimal/non decimal
		//boolean
		// System.out.println("enter 1st number");
		// int a = sc.nextInt();
		// System.out.println("enter 2nd number");
		// int b = sc.nextInt();
		// int c=a+b;
		// System.out.println("Addition is "+c);
		
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("My name is "+name);
	}

}
