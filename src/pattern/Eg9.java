package pattern;

public class Eg9 {

	public static void main(String[] args)
	{
		//Equilateral triangle Upward with space
		//   *
		//  * *
		// * * *
		//* * * *
       //rows-->4 columns-->4 space-->3 star-->1
		
		int star=1;
		int space=3;
		
		//outer for loop--> rows
	    
		for(int row=1;row<=4;row++)
		{
			//inner for loop for columns
			//space

			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			
			//star
			for(int column=1;column<=star;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}

}
