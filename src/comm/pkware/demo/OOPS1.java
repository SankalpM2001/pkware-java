package comm.pkware.demo;

//abstraction
abstract class Car
{
	abstract void price();
	abstract void mileage();
	
	void details()
	{
		System.out.println("Details of Car");
	}
}

class Honda extends Car
{
	void price()
	{
		System.out.println("Honda Price");
	}
	
	void mileage()
	{
		System.out.println("Honda Mileage");
	}
}

class Maruti extends Car
{
	void price()
	{
		System.out.println("Maruti Price");
	}
	
	void mileage()
	{
		System.out.println("Maruti Mileage");
		System.out.println();
	}
}


interface Music
{
	public void genre();
	public void bpm();
	default int fun()
	{
		return 100;
	}
}

interface Artist
{
	String name="Arijit";
	String type="hindi";
}

class Song implements Music,Artist
{
	public void genre()
	{
		System.out.println("Bollywood");
	}
	
	public void bpm()
	{
		System.out.println("100 BPM");
	}
}

public class OOPS1 {

	public static void main(String[] args) {
		
		Car myCar1= new Honda();
		Car myCar2= new Maruti();
		myCar1.price();
		myCar1.mileage();
		myCar2.price();
		myCar2.mileage();
		
		Song mySong=new Song();
		mySong.genre();
		mySong.bpm();
		System.out.println("The singer's name is: "+ Artist.name);
		System.out.println("The Language of song is: "+ Artist.type);
		//System.out.println(mySong.fun());
		

	}

}
