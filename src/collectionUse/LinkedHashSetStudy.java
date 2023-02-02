package collectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lh=new LinkedHashSet<>();
		
		lh.add("Pune");
		lh.add("Mumbai");
		lh.add("Nagpur");
		lh.add("Thane");
		lh.add("Pune");
		lh.add(null);
		lh.add(null);
		lh.add("Delhi");
		
		System.out.println(lh);
		
		System.out.println(lh.size());
          //for each,iterator
          //Assignment
		System.out.println("=================for each===============");
		for(String f:lh) 
		{
			System.out.println(f);
		}
		System.out.println("=============iterator==================");
		Iterator<String> it= lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
