package comm.pkware.demo;

class StringBuff{  
	public static void main(String args[]){  
			StringBuffer sb=new StringBuffer("Hello ");  
			sb.append("Java");
			
			System.out.println(sb);  
			sb.insert(1,"Java");
			System.out.println(sb); 
			StringBuffer s=new StringBuffer("Hello");  
			s.replace(1,3,"Java");  
			System.out.println(s);
			s.reverse();
			System.out.println(s);
}  
}  


