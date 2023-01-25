package comm.pkware.demo;
import java.util.*;

public class FlowControl {
	
	
	int ifelse(int a, int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
			
		}
		else if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FlowControl obj=new FlowControl();
		int a,b,c;
		System.out.println("Enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int res=obj.ifelse(a,b,c);
		System.out.println("Largest number is:"+ res);
		

	}

}
