package comm.pkware.demo;
import java.util.*;
public class TSet {

	public static void main(String[] args) {
			Set<String> ts=new TreeSet<>();
			
			ts.add("A");
			ts.add("B");
			ts.add("D");
			ts.add("Z");
			ts.add("C");
			
			Iterator<String> it=ts.iterator(); //Sorted elements by default
			
			while(it.hasNext())
			{
				System.out.print(it.next());
			}
			System.out.println();
			ts.add("1");
			ts.add("0");
			System.out.println(ts); //implements Comparable interface
			
			
	}

}
