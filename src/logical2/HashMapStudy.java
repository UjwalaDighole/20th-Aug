package logical2;

import java.util.HashMap;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) 
	{
        HashMap<String, String> rto=new HashMap<String, String>();
       //put-->add
        rto.put("MH12", "Pune");
        rto.put("MH13", "Solapur");
        rto.put("MH14", "PCMC");
        rto.put("MH15", "NASHIK");
        
        System.out.println(rto);
        
        rto.put("MH12", "Mumbai");
        System.out.println(rto);
        
        rto.put("MH01", "Mumbai");
        System.out.println(rto);
        
       System.out.println(rto.get("MH13"));
       System.out.println(rto.get("MH31"));
	
	//========================================
       //roll student name
       
       HashMap<Integer, String> studentInfo=new HashMap<Integer,String>();
       
	studentInfo.put(1, "Sachin");
	studentInfo.put(2, "Virendra");
	studentInfo.put(3, "VVS");
    studentInfo.put(4, "Dravid");
    
    System.out.println(studentInfo);
    System.out.println(studentInfo.get(3));
    System.err.println(studentInfo.get(5));
    System.out.println("=======================");
    Set<Integer> stdInf=studentInfo.keySet();
    
    for(Integer s:stdInf)//1
    {
    	System.out.println(s+":"+studentInfo.get(s));
    }
	}

}
