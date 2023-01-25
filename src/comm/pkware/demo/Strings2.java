package comm.pkware.demo;
import java.util.*;
public class Strings2 {
	
	
	public static boolean pangram(String s)
	{
		//pangram
		boolean mark[]=new boolean[26];
		int ind=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				ind=s.charAt(i)-'A';
			}
			
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				ind=s.charAt(i)-'a';
			}
			else
				continue;
			mark[ind]=true;
		}
	
		for(int i=0;i<=25;i++)
		{
			if(mark[i]==false)
				{
					return false;
				}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a string");
		String s=sc.next();
		
		if (pangram(s) == true)
            System.out.print("Pangram");
        else
            System.out.print("Not a Pagram");
	}

}
