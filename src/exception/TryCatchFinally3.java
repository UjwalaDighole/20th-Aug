package exception;

public class TryCatchFinally3 {

	public static void main(String[] args) 
	{
		String a="Testing";
		
		try
		{
			System.out.println(a.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Please check string value,should not be null");
		}

		finally
		{
			System.out.println("Good evening");
		}
	}

}
