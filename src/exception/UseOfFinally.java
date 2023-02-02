package exception;

public class UseOfFinally {

	public static void main(String[] args) {
		 int a=10;
		 int b=0;
		 
		 try
		 {
			 int div=a/b;
			 System.out.println(div);
		 }

		 finally
		 {
			 System.out.println("Finally print this");
		 }
		 
		 System.out.println("hi good even");
		 
		 // catch(ArithmaticException e
		 //
		 //{
		 // System.out.println("Divide by zero is not possible");
          //}
	}

}
