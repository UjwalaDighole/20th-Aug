package pattern;

public class Eg12 {

	public static void main(String[] args) 
	{
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		// rows-->9; columns-->5; star-->*
		
		int star=1;
		//outer for loop
        
		for(int row=1;row<=9;row++)
		{
			//inner for loop
			//star
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(row<5)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}
