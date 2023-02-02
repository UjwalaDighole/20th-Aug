package collectionUse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
	   LinkedList<Object> ll=new LinkedList<>();

	   ll.add("Pune");
	   ll.add(123);
	   ll.add(22.22f);
	   ll.add(null);
	   ll.add(null);
	   ll.add(true);
	   ll.add("Pune");
	   ll.add('A');
	   System.out.println(ll);
	   System.out.println("================================");
	   ll.add(3, "Hello");
	   System.out.println(ll);
	   System.out.println("=================================");
	   
	   ll.add("new");
	   ll.add("old");
	   System.out.println(ll);
	   System.out.println("=================================");
	   
	   //ll.clear();
	   System.out.println("=================================");
	   System.out.println(ll.contains("new"));
	   System.out.println("=================================");
	   
	   System.out.println(ll.element());
	   System.out.println(ll);
	   System.out.println("=================================");
	   
	   System.out.println(ll.get(2));
	   System.out.println("=================================");
	   
	   System.out.println(ll.getFirst());
	   System.out.println(ll.getLast());
	   System.out.println(ll);
	   System.out.println("===================================");
	   
	   ll.indexOf("Pune");
	   System.out.println(ll.size());
	   ll.set(5, "Katraj");
	   System.out.println(ll);
	   System.out.println("===================================");
	   
	   System.out.println(ll.peek());
	   System.out.println(ll);
	   System.out.println(ll.poll());
	   System.out.println(ll);
	   System.out.println("======================================");
	   
	   System.out.println(ll.peekFirst());
	   System.out.println(ll.peekLast());
	   
	   System.out.println(ll);
	   System.out.println("======================================");
	   System.out.println(ll.pollFirst());
	   System.out.println(ll.pollLast());
	   System.out.println(ll);
	   System.out.println("=======================================");
	   
	   System.out.println(ll);
	   System.out.println(ll.pop());
	   System.out.println(ll);
	   System.out.println("======================================");
	   
	   System.out.println(ll);
	   ll.push("Mumbai");
	   System.out.println(ll);
	   ll.remove(0);
	   System.out.println("===============Traversing through linkedlist==========");
	   
	   System.out.println("==============for loop==================");
	   //for loop--> if there is get method
	   System.out.println("Assignment");
	   
	   //for each
	   System.out.println("=============for each loop===========");
	   for(Object l:ll)
	   {
		   System.out.println(l);
	   }
	   System.out.println("==============iterator==============");
	   
	   Iterator<Object> it = ll.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	   System.out.println("==============List-iterator============");
	   System.out.println("Assignment");
	   
	   ListIterator<Object>li=ll.listIterator();
       
       while(li.hasNext())
       {
       	System.out.println(li.next());
       }
	}

}
