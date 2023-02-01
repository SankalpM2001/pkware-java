package comm.pkware.demo;
import java.util.*;
class StudentDetails implements Comparable<StudentDetails>
{
	int marks;
	String name;
	
	public StudentDetails(int marks,String name)
	{
		this.marks=marks;
		this.name=name;
	}
	
	
	public int compareTo(StudentDetails obj)
	{
		 if(this.marks>obj.marks) return 1;
		else if(this.marks<obj.marks) return -1;
		 
		return this.name.compareTo(obj.name);
	}
}
public class ComparableClass {
	
	public static void main(String[] args)
	{
		List<StudentDetails> s=new ArrayList<>();
		s.add(new StudentDetails (83,"Sankalp"));
		s.add(new StudentDetails(91,"Basav"));
		s.add(new StudentDetails(87,"Ram"));
		s.add(new StudentDetails(87,"Aman"));
		
		Collections.sort(s);
		s.forEach(System.out::println);
	}

}
