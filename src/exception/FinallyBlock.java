package exception;

public class FinallyBlock {

	public static void main(String[] args)
	{
		String a="abc";
		try
		{
			System.out.println(a.charAt(1));
		}

		finally
		{
			System.out.println("Hi i am finally block");
		}
	}

}
