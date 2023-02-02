package logical;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		//5
		int num=2;//2,3,4,5,6
		int count=0;
		for(int i=2;i<num;i++)
		{
		if(num%i==0)
		{
		count++;
		break;
		}
		}
		if(count==1)
		{
		System.out.println("Given number is not prime number");
		}
		else
		{
		System.out.println("Given number is prime number");
        }
	}
}
