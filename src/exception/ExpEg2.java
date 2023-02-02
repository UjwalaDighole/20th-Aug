package exception;

public class ExpEg2 {

	public static void main(String[] args)
	{
		String a="abc";
		
		try 
		{
		    //risky code
			System.out.println(a.charAt(11));  //risky code when value>2
			System.out.println("hi hello");
		}

		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("please select index range between 0-2");
		}
		System.out.println("Good evening");
	}

}
