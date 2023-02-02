package screenShot;

import net.bytebuddy.utility.RandomString;

public class Sample {

	public static void main(String[] args) 
	{
		String myString = RandomString.make(4);
        System.out.println(myString);
	}

}
