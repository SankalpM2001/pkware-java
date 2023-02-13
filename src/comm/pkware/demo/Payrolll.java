package comm.pkware.demo;
import java.util.*;
interface salary
{
	void salaryDetails();
	
}

class EmpDetails
{
	String name,type,email;
	static int hours,sales;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter Employee details");
		System.out.println("Name:");
		this.name=sc.nextLine();
		System.out.println("email");
		this.email=sc.nextLine();
		System.out.println("Enter the type of employee:");
		this.type=sc.nextLine();
		
		
		if(this.type.equals("hourly"))
		{
			System.out.println("Enter hours");
			hours=sc.nextInt();
		}
		
		if(this.type.equals("commission")||this.type.equals("basecomm"))
		{
			System.out.println("Enter sales");
			sales=sc.nextInt();
		}
	}
}


class Salaried  implements salary
{
	public void salaryDetails()
	{
		System.out.println("Salary is 20000");
	}
}


class Hourly implements salary
{
	public void salaryDetails()
	{
		if(EmpDetails.hours>40)
		{
			double salary=(500*40)+((EmpDetails.hours-40)*1.5*500);
			System.out.println("Salary of Hourly employee is: "+ salary);
		}
		
		else
		{
			double salary=500*EmpDetails.hours;
			System.out.println("Salary of hourly employee  is: "+salary);
		}
	}
}

class Comm implements salary
{
	public void salaryDetails()
	{
		double salary=15*EmpDetails.sales/100;
		System.out.println("Salary of commisioned employee is: "+salary);
	}
}

class BS extends EmpDetails implements salary
{
	public void salaryDetails()
	{
		int base_salary=15000;
		double bonus=10*15000/100;
		double salary=bonus+base_salary+(12*EmpDetails.sales/100);
		System.out.println("Salary of base-comm employee is: "+salary);
	}
}

class Design
{
	public salary calDetails(String type)
	{
		switch(type)
		{
		case "salaried":
			return new Salaried();
		case "hourly":
			return new Hourly();
		case "commision":
			return new Comm();
		case "basecom":
			return new BS();
		default:
			System.out.println("Error in type");
		}
		return null;
		
		
	}
}
public class Payrolll {

	public static void main(String[] args)
	{
		EmpDetails obj=new EmpDetails();
		obj.getDetails();
		Design d=new Design();
		salary s=d.calDetails(obj.type);
		
		s.salaryDetails();
		

	}

}
