package comm.pkware.demo;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		
		int n=sc.nextInt();
		assert n>0: "Not valid! a negative number";
		
		System.out.println(n);

	}

}
