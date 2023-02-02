package pattern;

public class Eg8 {

	public static void main(String[] args) 
	{
		//    *
		//   ***
		//  *****
		// *******

		//row-->4; column-->7; space-->3; star-->1
		
		int space=3;
		int star=1;
		
		//outer for loop; row=4;
		for(int row=1;row<=4;row++)
		{
			//inner for loop
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
			star=star+2;
			space--;
			
		}
	}

}
