package stringStudy;

public class StringStudyNew {

	public static void main(String[] args) 
	{
		String s="Pune";
		String s1= s.substring(1);
		System.out.println(s1);
		System.out.println("==============");		
        StringBuffer sb=new StringBuffer("Pune");
       
   //     sb.reverse();
   //     System.out.println(sb);
        
        sb.append(" Katraj");
        System.out.println(sb);
        
        sb.insert(5, "Swargate ");
        System.out.println(sb);
	}

}
