package pattern;

public class Eg2 {

	public static void main(String[] args) 
	{
		//*****
		//*****
		//*****
		//*****
		//*****
		
		//rows--> 5 columns-->5
		//outer for loop-->rows
		
		for(int row=1;row<=5;row++)//1,2,3,4,5, no 6
		{
			//inner for loop-->columns
			for(int column=1;column<=5;column++)//1,2,3,4,5, no 6
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
