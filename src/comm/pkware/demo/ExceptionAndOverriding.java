package comm.pkware.demo;

class Parent
{
	void fun() throws Throwable
	{
		System.out.println("Parent function");
	}
	
	
}

class Child extends Parent
{
	void fun()throws ArithmeticException  //unchecked exception and subclass exception
	{
		System.out.println("Child function"+ 10/0);
	}
}
public class ExceptionAndOverriding {
	
	
	public static void main(String[] args)
	{
		Parent obj=new Child();
		
		try
		{
			obj.fun();
		}
		
		catch(Throwable e) {
			System.out.println("Exception caught");
		}

		
	}
	
	
}
