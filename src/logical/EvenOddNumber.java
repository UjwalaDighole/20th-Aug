package logical;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args)
	{
		// evenNum/2-->remainder-->0
		// System.out.println(10/2);
		// System.out.println(10%2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		if(num%2==0)
		{
		System.out.println("Given number is even number");
		}
		else {
		System.out.println("Given number is odd number");
		}

	}

}
