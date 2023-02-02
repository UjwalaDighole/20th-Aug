package pattern;

public class Ex6 {

	public static void main(String[] args) 
	{
		//      *
		//     **
	    //    ***
	    //   ****
	    //  *****
		
		//row-->5 column-->5
		
		int space=4;
		int star=1;
		
		for(int row=1;row<5;row++)
		{
			
		//outer for loop-->rows
		//space
		
		for(int i=1;i<=space;i++)
		{
			System.out.print("");
		}
         //star
		for(int column=1;column<=star;column++)
		{
			System.out.print("*");
		}
		System.out.println();
	    star++;
	    space--;
	    
	    
		}  
	}
	

}
