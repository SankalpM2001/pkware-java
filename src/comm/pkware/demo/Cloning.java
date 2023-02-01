package comm.pkware.demo;

class ABC
{
	int x=20;
}
public class Cloning {

	public static void main(String[] args) {
		
		ABC obj1=new ABC();
		ABC obj2=obj1;
		
		obj2.x=10; //shallow cloning
		
		ABC obj3=new ABC();
		obj3.x=30;  //deep cloning
		System.out.println(obj1.x+" "+obj2.x);
		System.out.println(obj1.x+" "+obj2.x+" "+obj3.x);
		
		
		String s1=new String("Dataguise is a good company");
		String s2=s1;
		s2="Dataguise is good"; //
		System.out.println(s1.hashCode()+","+s2.hashCode());
		System.out.println(s1+","+s2);  //Deep cloning and shallow both
		
		
		

	}

}
