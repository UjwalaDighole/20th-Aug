package exception;

public class TryCatchFinally {

	public static void main(String[] args)
	{
		String a="abc";
		try
		{
			System.out.println(a.charAt(12));  //risky code
		}
		
		catch(NullPointerException e)
		{
			System.out.println("a value should not be null");
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			
		}

		finally
		{
			System.out.println("Bye");
		}
	}

}
