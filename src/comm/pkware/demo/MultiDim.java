package comm.pkware.demo;
import java.util.*;
public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]%2==0)
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println();
		}
		
		

	}

}
