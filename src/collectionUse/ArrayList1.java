package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) 
	{
        ArrayList<Object> al=new ArrayList<Object>();
        
        al.add("Hi");
        al.add(123);
        al.add('A');
        al.add(null);
        al.add(12.12f);
        al.add(true);
        System.out.println(al);
        
        //traversing using for loop
        System.out.println("================using for loop======");
       for(int i=0;i<=al.size()-1;i++)//0,1,
       {
    	   System.out.println(al.get(i));
       }
       System.out.println("================using iterator======================");
       //traversing using iterator
       Iterator<Object> it=al.iterator();
       
       while(it.hasNext())
       {
         System.out.println(it.next());
       }
       
       System.out.println("=============using list iterator====================");
       ListIterator<Object> li=al.listIterator();
       
       while(li.hasNext())
       {
    	   System.out.println(li.next());
       }
       System.out.println("============using for each========================");
       
       for(Object a:al)
       {
    	   System.out.println(a);
       }
       
    //   ArrayList<Integer> al1=new ArrayList<>();
   //    ArrayList<Float> al2=new ArrayList<>();
   //    ArrayList<Character> al3=new ArrayList<>();
  //     ArrayList<String> al4=new ArrayList<>();
    		   
       
	}

}
