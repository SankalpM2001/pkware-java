package comm.pkware.demo;

class Parent
{
	void fun() throws Exception
	{
		System.out.println("Parent function");
	}
	
	
}

class Child extends Parent
{
	void fun()throws ArithmeticException  //unchecked exception and subclass exception
	{
		System.out.println("Child function");
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
		
		catch(Exception e) {
			System.out.println("Exception caught");
		}

		
	}
	
	
}
