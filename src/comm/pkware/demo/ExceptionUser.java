package comm.pkware.demo;

public class ExceptionUser extends Exception
{
	private static int roll[]= {1,2,3,4};
	private static String name[]= {"A","B","C","D"};
	
	ExceptionUser(String s)
	{
		super(s);
	}

	public static void main(String[] args) 
	{
		try {
			System.out.println("roll nos. and Names");
			for(int i=0;i<5;i++)
			{
				System.out.println(roll[i]+" "+name[i]);
				if(roll[i]>4)
				{
					ExceptionUser eu=new ExceptionUser("Cannot have roll no. more than 4");
					throw eu;
					
				}
			}
		}
		
		catch(ExceptionUser eu)
		{
			eu.printStackTrace();
		}
		
		

	}

}
