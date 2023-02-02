package logical;

public class CountNumberOfBlankSpaces {

	public static void main(String[] args) 
	{
		// P U  N  E-->5
		String s="PUNE ";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
		char t = s.charAt(i);
		if(t==' ')
		{
		count++;
		}
		}
		System.out.println("Number of blank spaces are "+count); 

	}

}
