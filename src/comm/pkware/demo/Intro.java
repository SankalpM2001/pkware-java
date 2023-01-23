package comm.pkware.demo;
import java.util.*;

public class Intro {
	int n1,n2;
	int[] twosum(int a[],int n,int t)
	{
		int i=0;
		int j=n-1;
		int temp[]=new int[n];
		for(int p=0;p<n;p++)
		{
			temp[p]=a[p];
		}
		Arrays.sort(temp);
		int result[]=new int[2];

		while(i<j)
		{
			if(temp[i]+temp[j]==t)
			{
				n1=temp[i];
				n2=temp[j];
				break;
			}
			else if(temp[i]+temp[j]>t)
				j--;
			else if(temp[i]+temp[j]<t)
				i++;
		}
		
		for(int l=0;l<n;l++)
		{
			if(a[l]==n1)
				result[0]=l;
			else if(a[l]==n2)
				result[1]=l;
			
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Intro obj=new Intro();
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter arry elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter target");
		int target=sc.nextInt();
		int res[]=obj.twosum(a, n,target);
		System.out.println(res[0]+","+res[1]);
	}

}
