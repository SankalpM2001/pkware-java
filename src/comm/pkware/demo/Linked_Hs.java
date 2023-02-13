package comm.pkware.demo;
import java.util.*;
public class Linked_Hs {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		LinkedHashSet<Integer> lh=new LinkedHashSet<>(al);
		System.out.println(lh);
		
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		Iterator<Integer> it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		l.add(3);
		
		l.retainAll(lh);
		System.out.println("Intersection is: "+l);
		
		l.addAll(lh);
		l.removeAll(lh);
		System.out.println("difference is: "+l);
		
		l=(LinkedHashSet<Integer>)lh.clone();
		boolean res=l.containsAll(lh);
		System.out.println("Subset: "+res);
	}

}
