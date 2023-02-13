package comm.pkware.demo;
import java.util.*;
public class Set_Practice1 {

	public static void main(String[] args) {
	
        HashSet<String> h = new HashSet<String>();
        h.add("Alan");
        h.add("Martin");
        h.add("Nick");
  
        h.add("Martin");
  
      
        System.out.println(h);
        System.out.println( h.contains("Nick"));
  
   
        h.remove("Australia");
        System.out.println(h);
        HashSet<String> h2;
       
        h2=(HashSet<String>)h.clone();
        System.out.println(h2);

        Iterator<String> i = h.iterator();
  
        while (i.hasNext())
        {
        	System.out.println(i.next());
        }
	}
}

	


