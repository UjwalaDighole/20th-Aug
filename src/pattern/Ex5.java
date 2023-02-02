package pattern;

public class Ex5 {

	public static void main(String[] args)
	{
		//*****
		//****
		//***
		//**
		//*
		//row-->5;columns-->5
		
		int space=0;
		int star=5;
		
		//outer for loop-->rows
		
		for(int row=1;row<=5;row++)
		{
			//inner for loop-->column
			//space
			for(int i=1;i<=space;i++)//1
			{
				System.out.print("");
			}
			//star
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space++;
			star--;
		}
	}

}
