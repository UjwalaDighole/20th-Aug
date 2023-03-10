package logical2;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharInString {

	public static void main(String[] args)
	{
		String str="abcdabcdxyzpqrxyzp";
		String s="abc xyz abc xyz pqqr";
		
		HashMap<Character, Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<str.length()-1;i++)
		{
			 char t = str.charAt(i);
			if(mp.containsKey(t))//a
			{
				mp.put(t, mp.get(t)+1);
			}
			else
			{
				mp.put(t, 1);
			}
		//System.out.println(mp);
			
			Set<Character> duplicateCount = mp.keySet();
			
			for(Character d:duplicateCount)
			{
				
				System.out.println(d+": "+mp.get(d));
			}
			System.out.println("=========================");
			
			for(Character d:duplicateCount)
			{
				if(mp.get(d)>1)
				{
					System.out.println(d+":"+mp.get(d));
				}
			}
		}
	}

}
