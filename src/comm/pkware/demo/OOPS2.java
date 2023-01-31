package comm.pkware.demo;
//Encapsulation

class Game
{
	private String name;
	private int sizeInGb;
	
	public String getDetails()
	{
		int s=sizeInGb*1024;
		return ("Name of game is: "+name+"\nSize in MB is: "+s);
	}
	
	public void setDetails(String name,int sizeInGb)
	{
		this.name=name;
		this.sizeInGb=sizeInGb;
	}
}
public class OOPS2 {

	public static void main(String[] args) {
		Game obj=new Game();
		obj.setDetails("Hitman 3", 60);
		System.out.println(obj.getDetails());
		//System.out.println(obj.name); (Not visible)
	}

}
