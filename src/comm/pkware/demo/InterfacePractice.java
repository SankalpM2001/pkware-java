package comm.pkware.demo;
import java.util.*;
interface P
{
    void myMethod();
    int a=20;
    int funP();
  
}

interface Z extends P
{
	int b=10;
	int funZ();
}
class Q 
{
    public void myMethod() //should be public
    {
        System.out.println("My Method");
        
    }
}
 
class R extends Q implements P,Z
{
     public void fun()
     {
    	 System.out.println("R function");
     }
     
     public int funP()
     {
    	 return a+b;
     }
     
     public int funZ()
     {
    	 return a-b;
     }
     
     interface I
     {
    	 int i=100;
     }
}
public class InterfacePractice {

	public static void main(String[] args) {
		P p=new R(); //new P cannot as we cannot create object of interface
		p.myMethod();

		R r=new R();
		r.fun();
		
		
		System.out.println(r.funP());
		System.out.println(r.funZ());
		
		System.out.println(R.I.i); //accessing a interface inside a Class
		
	
		
		
	}

}
