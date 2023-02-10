package comm.pkware.demo;
import java.util.*;
public class QueueImp {
	

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		Iterator<Integer> it=q.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
		
		q.poll();
		System.out.println(q);
		System.out.println(q.peek());
		
		Queue<Integer> pq=new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(3);
		

		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		

	}

}
