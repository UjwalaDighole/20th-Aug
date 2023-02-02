package pattern;

public class Ex3 {

	public static void main(String[] args)
	{
		//*
		//**
		//***
		//****
		//*****
		
		//rows-->5 columns-->5
		int star=1;//2//3
		
		//outer for loop-->rows
		
		for(int row=1;row<=5;row++) //1,2
		{
			//inner for loop-->columns
			
			for(int column=1;column<=star;column++)//1,2,3
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}

	}

}
