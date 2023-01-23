package comm.pkware.demo;
import java.util.*;
public class Balanced {
	public static boolean check(String str)
	{
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='('||c=='{'||c=='[')
				st.push(c);
			else
			{
				char ch=st.peek();
				st.pop();
				if(str.charAt(i)==')'&&ch!='(' || str.charAt(i)=='}'&&ch!='{' || str.charAt(i)==']'&&ch!='[')
					return false;
			}
				
		}
		return true;
		
	}
	
	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str=sc.next();
		boolean res=check(str);
		System.out.println(res);
	}

}
