package comm.pkware.demo;
import java.util.*;
class SD implements Comparator<SD>
{
	int marks;
	String name;
	
	public SD(int marks,String name)
	{
		super();
		this.marks=marks;
		this.name=name;
	}
	public SD()
	{
		marks=0;
		name="";
	}
	
	
	public int compare(SD ob1,SD ob2)
	{
		 if(ob1.marks==ob2.marks)
			 return ob1.name.compareTo(ob2.name);
		 else if(ob1.marks>ob2.marks)
			 return 1;
		 return -1;
	}
}
public class ComparatorPractice{
	
	public static void main(String[] args)
	{
		List<SD> s=new ArrayList<>();
		s.add(new SD (83,"Sankalp"));
		s.add(new SD(91,"Basav"));
		s.add(new SD(87,"Ram"));
		s.add(new SD(87,"Aman"));
		
		Collections.sort(s,new SD());
		for(SD obj : s)
		{
			System.out.println(obj.marks+" "+obj.name);
		}
			
	}

}
