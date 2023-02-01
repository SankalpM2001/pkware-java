package comm.pkware.demo;
import java.util.*;
class Test
{
	int x;
	int y;
}

class Test2 implements Cloneable
{
	int a;
	int b;
	int c;
	Test t=new Test();
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class CloneablePractice {
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test2 t1=new Test2();
		t1.a=10;
		t1.b=20;
		t1.c=30;
		t1.t.x=40;
		t1.t.y=50;
		
		Test2 t2=(Test2)t1.clone(); //shallow cloning
		 t2.a=100;
		 t2.t.x=300;
		 
		 System.out.println(t1.a+" "+t1.b+" "+t1.c+" "+t1.t.x+" "+t1.t.y );
		 System.out.println(t2.a+" "+t2.b+" "+t2.c+" "+t1.t.x+" "+t1.t.y);
		 
		 
		
	}

}
