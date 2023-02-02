package collectionUse;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet<Object>t=new TreeSet<>();
		
	//	t.add('Z');
	//	t.add('A');
	//	t.add('X');
	//	t.add('B');
	//	t.add('T');
		
	//	t.add("Pune");
	//	t.add("Dellhi");
	//	t.add("Mumbai");
	//	t.add("Nashik");
	//	t.add("Pune");
		
		t.add(10);
	//	t.add(8);
		t.add(1);
	//	t.add(4);
		t.add(3);
		t.add(5);
		t.add(7);
		t.add(6);
		t.add(2);
		
		
		System.out.println(t);
		
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.ceiling(4));
		System.out.println(t.floor(8));
		
		System.out.println(t.higher(3));
		System.out.println(t.lower(3));
		//for each, iterator-->Assignment
		
        System.out.println("=============for each====================");
		for(Object f:t)
		{
			System.out.println(f);
		}
		
       System.out.println("=============using Iterator==============");
       Iterator<Object> it= t.iterator();
       while(it.hasNext()) 
       {
        System.out.println(it.next());
       } 
        
        
	}

}
