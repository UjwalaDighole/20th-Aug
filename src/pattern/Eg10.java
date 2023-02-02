package pattern;

public class Eg10 {

	public static void main(String[] args) 
	{
		//Equilateral triangle downward with space
		// * * * * *
        //  * * * *
        //   * * *
		//    * *
		//     *
		
		//row--> column-->  star-->  space-->
		
		int space=0;  //no. of space in first row
		int star=5;    // no. of space in first row
		
		//outer for loop-->rows
		
		for(int row=1; row<=5; row++)
		{
			//inner for loop
			for(int i=1; i<=space; i++)  
			{
				System.out.print(" ");
			}
			
			for(int column=1; column<=star; column++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			space++;
			star--;
		}
	}

}
