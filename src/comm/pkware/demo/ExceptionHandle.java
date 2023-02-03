package comm.pkware.demo;


public class ExceptionHandle {
	
	static void fun()throws ArithmeticException
	{
		
		int a=10;
		for(int i=10;i>=0;i--)
		{
			System.out.println(a/i);
		}
	}

	public static void main(String[] args) {
		try 
		{
			ExceptionHandle.fun();
		}
		catch(Exception e)
		{
			System.out.println("Error! Can't divide by zero");
			e.printStackTrace();
			
			try 
			{
				throw new Exception("Array error");
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		
		finally
		{
			System.out.println("Reached finally block");
		}

	}

}
