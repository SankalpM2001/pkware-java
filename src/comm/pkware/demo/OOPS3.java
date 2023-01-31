package comm.pkware.demo;
//Polymorphism and Inheritance

class A
{
	protected int test=20;
	
	public int getArea(int l, int b)
	{
		System.out.println("A class function");
		return l*b;
	}
}
class B extends A
{

	public int getArea(int l, int b)
	{
		System.out.println("B class function");
		return 4*l*b;
	}
}
public class OOPS3 {

	public int getArea(int a)
	{
		return a*a;
	}
	public static void main(String[] args) {
		A obj=new B();
		OOPS3 ob=new OOPS3();
		int res=obj.getArea(10, 20); //dynamic(overriding)
		System.out.println(res);
		int res2=ob.getArea(10); //static(overloading)
		System.out.println(res2);
		System.out.println(obj.test);

	}

}
