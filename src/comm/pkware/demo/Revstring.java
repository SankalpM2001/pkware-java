package comm.pkware.demo;

import java.util.*;
public class Revstring {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String to reverse");
		
		String str = sc.nextLine();
		int l=str.length();
		String str2="";
		for (int i = l- 1; i >= 0; i--) {
			char c=str.charAt(i);
			str2=str2+c;
		}
		System.out.print(str2);
	}
}