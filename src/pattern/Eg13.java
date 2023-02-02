package pattern;

public class Eg13 {

	public static void main(String[] args)
	{
		// row columns space star
		
				int space1=5;
				int space2=4;
				int star1=1;
				int star2=1;
				//inner for loop
				//star1
			for(int row=1; row<=9; row++)
			{
				for(int i=1;i<=star1;i++)
				{
					System.out.print(i);
				}
				
				//space1
				for(int j=1;j<=space1;j++)
				{
					System.out.print(" ");
				}
				
				//space2
				for(int k=1;k<=space2;k++)
				{
					System.out.print(" ");
				}
				//star2
				for(int l=1;l<=star2;l++)
				{
					System.out.print(l);
				}
				System.out.println();
				if(row<5)
				{
					star1++;
					star2++;
					space1--;
					space2--;
				}
				else
				{
					star1--;
					star2--;
					space1++;
					space2++;
				}
				}

	}

}
