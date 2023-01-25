package comm.pkware.demo;
import java.util.*;
public class Arrays2 {
	public static void main(String[] args)
	{
		//finding the kth smallest and largest array element
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter k");
		int k=sc.nextInt();
		Arrays.sort(a);
		
		System.out.println("Kth smallest number "+a[k-1]);
		System.out.println("Kth Largest number "+a[n-k]);
		
	}
}
