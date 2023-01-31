package comm.pkware.demo;

enum Days{
	Mon(1),Tue(2),Wed(3),Thurs(4),Fri(5),Sat(6),Sun(0);
	private int x;
	private Days(int x)
	{
		this.x=x;
	}
	
	public int getValues()
	{
		return this.x;
	}

}
public class EnumPractice {

	public static void main(String[] args) {
		
		Days d=Days.Mon;
		
		System.out.println(d);
		
		
		//traversing
		for(Days dd: Days.values())
		{
			System.out.println(dd + " " + dd.getValues());
		
		}
		
		System.out.println(Days.valueOf("Mon"));
		System.out.println(Days.valueOf("Fri").ordinal());

	}

}
