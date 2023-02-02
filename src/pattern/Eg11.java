package pattern;

public class Eg11 {

	public static void main(String[] args) 
	{
	     // *****
		 // ****
		 // ***
		 // **
		 // *
		 // **
		 // ***
		 // ****
		 // *****
      
		//row-->9  column-->5  star-->5
		int star=5;
		
		//outer for loop-->
		for(int row=1; row<=9; row++)
		{
			//inner for loop-->column
			//star
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(row<5)
			{
				star--;
			}
			else 
			{
				star++;
			}
		}
		
		
	}

}
