package exception;

public class TryCatchFinally2 {

	public static void main(String[] args) 
	{
		String a="abc";
		
		try
		{
			System.out.println(a.charAt(12));
		}

		catch(NullPointerException e)
		
		{
		    System.out.println("a value should not be null");	
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("index value should be within 0-2");
		}
		
		catch(Exception e)
		{
			
		}
		
		finally
		{
			System.out.println("Bye...");
		}
	}

}
