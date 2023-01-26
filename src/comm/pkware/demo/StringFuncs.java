package comm.pkware.demo;

public class StringFuncs {

	public static void main(String[] args) {
		String s1="Sankalp";
		String s2=new String("Mukherjee");
		/*System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));*/
		
		String s="Hello Java";
		System.out.println(s.charAt(4));
		System.out.println(s.substring(2,5));
		System.out.println(s.codePointAt(0));
		System.out.println(s1.concat(s2));
		System.out.println(s.indexOf('l'));
		char c[]=s.toCharArray();
		System.out.println(c[3]);

	}

}
