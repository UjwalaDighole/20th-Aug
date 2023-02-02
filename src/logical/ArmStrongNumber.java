package logical;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		//123=1^3+2^3+3^3=1+8+27=36
		//153=1^3+5^3+3^3=1+125+27=153
		
		int a=153;
		int b=0;
		for(int i=a;i>0;i=i/10)
		{
			System.out.println(i);
			int t = i%10;//3,5,1
			b=b+(t*t*t);
			//27=0+27
			//152=27+125
			//153=152+1
		}
		
        if(a==b)
        {
        	System.out.println(a+"is ArmStrong Number");
        	
        }
        else
        {
        	System.out.println(a+" is not ArmSStrong Number");
        }
	}

}
