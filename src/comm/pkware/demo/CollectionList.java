package comm.pkware.demo;
import java.util.*;
import java.io.*;
public class CollectionList {

	public static void main(String[] args) 
	{
		//Basic Arraylist
		
		List<Integer> al=new ArrayList<Integer>(10);
		
		al.add(0,10);
		al.add(20);
		
		al.add(2,30);
		al.add(40);
		al.add(new Integer(20));
		al.add(2,50);//adds element and pushes the rest to right
		
		System.out.println(al);
		
		al.set(1,1);
		System.out.println(al);
		al.addAll(1,al);
		System.out.println(al);
		Integer item=1;
		int item2=1;
		
		al.remove(item);
		System.out.println(al);
		
		al.remove(item2);
	
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("Getting element at index 1- "+al.get(1));
		
		List<Integer> al2=new ArrayList<Integer>();
		al.addAll(al2);
		
		System.out.println(al.equals(al2));
		
		System.out.println(al.containsAll(al2));
		
		//printing using Iterator
		Iterator<Integer> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		Collections.sort(al);
		System.out.println(al);
		
		al.removeIf(n->(n%10==0)); //predicate removeIf
		System.out.println(al);
	
		
		
		//Stacks
		
		Stack<String> s=new Stack<>();
		
		s.add("Hello");
		s.push("World");
		s.push("This");
		s.push("Is a ");
		s.push("Stack!");

		System.out.println(s);
		
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		System.out.println(s.empty()); //isempty() works too
		System.out.println(s.search("world"));
		
		
		//LinkedList
		
		LinkedList<Character> ll=new LinkedList<>();
		
		ll.add('a');
		ll.add('b');
		ll.add('c');
		ll.add('d');
		ll.add('e');
		//ll.addLast('s');
		ll.poll();
		
		System.out.println(ll);
		
		LinkedList<Character> ll2=new LinkedList<>();
		ll2.addAll(ll);
		
		System.out.println(ll2);
		
		ll2.removeLast();
		
		Iterator<Character> i=ll2.descendingIterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		System.out.println();
		
		Character[] c=new Character[5];
		ll.toArray(c);
		
		for(char ch: c)
		{
			System.out.print(ch+" ");
		}
		
	
		

	}

}
