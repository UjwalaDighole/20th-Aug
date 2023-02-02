package pattern;

public class Eg7 {

	public static void main(String[] args) 
	{
		// *******
		//  *****
		//   ***
		//    *
		
		//row-->4 columns-->7 space-->0 star-->7
		
		int space=0;
		int star=7;
		
		//outer for loop--> rows
		for(int row=1; row<=4; row++)
		{
			//space
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			} 
			
			//star
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
		}

	}

}
