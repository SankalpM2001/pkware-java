package comm.pkware.demo;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
		HashMap<Integer,String> num = new HashMap<>();
		num.put(1, "Java");
		num.put(2, "Python");
	    num.put(3, "Cpp");
	    System.out.println(num);

	    System.out.println("Keys: " + num.keySet());

	    System.out.println("Values: " + num.values());

	    System.out.println("Key/Value mappings: " + num.entrySet());
	    num.replace(3, "JS");
	    System.out.println("Changed value is : "+num.get(3));
	    num.put(4, "Scala");
	    num.remove(3);
	    
	 // iterating through keys only
	    System.out.print("Keys: ");
	    for (Integer k : num.keySet())
	    {
	      System.out.print(k);
	      System.out.print(", ");
	    }
	    System.out.println();
	    // iterating through values only
	    System.out.print("Values: ");
	    for (String v : num.values())
	    {
	      System.out.print(v);
	      System.out.print(", ");
	    }
	    System.out.println();
	    // iterating through key/value entries
	    System.out.print("Entries: ");
	    for (Map.Entry<Integer, String> entry : num.entrySet()) 
	    
	    {
	      System.out.print(entry);
	      System.out.print(", ");
	    
	    }

	    
	    TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	    tm.put(1, "A");
	    tm.put(3,"S");
	    System.out.println(tm.getOrDefault(2,"D"));
	    
	}
}
