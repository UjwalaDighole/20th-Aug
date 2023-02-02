package logical;

public class RevserseTheNumberWithoutConversion {

	public static void main(String[] args)
	{
		//123-->321
		int a=123;
		int revnum=0;
		
		System.out.println(a/10);
		System.out.println(a%10);

		System.out.println(12%10);
		System.out.println(12/10);
		
		System.out.println(1%10);
		System.out.println("==========");
		
		for(int i=a;i>0;i=i/10)//123,12,1
		{
			int t = i%10; //3,2,1
			revnum=revnum*10+t;
			//0*10+3=3
			//3*10+2=32
			//32*10+1=321
		}
		System.out.println("Original number is"+a);
		System.out.println("Reversse number is"+revnum);
	}

}
