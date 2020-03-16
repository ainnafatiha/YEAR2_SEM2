import java.util.*;

abstract class Card
{
	String recipient;
	public abstract void greeting();
}

class KadRaya extends Card
{
	 public KadRaya ( String r)
	 {
	 	 recipient = r;
	 }

	 public void greeting()
	 {
	 	System.out.println("Dear " + recipient + ",\n");
	 	System.out.println("Selamat Hari Raya!\n\n");
	 }
}

class Birthday extends Card
{
	int age;

	public Birthday( String r, int years)
	{
		recipient = r;
		age=years;
	}

	public void greeting()
	{
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Happy " + age+ "th Birthday\n");
	}
}

class Wedding extends Card
{
	public Wedding( String n)
	{	recipient=n;	}

	public void greeting()
	{
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Happy newlywed!\n");
	}
}


public class CardTester1
{
	public static void main(String[] args)
	{
		KadRaya kad1=new KadRaya("Haziqah");
		System.out.println("*************************");
		kad1.greeting();
		System.out.println("*************************");

		Birthday bday=new Birthday("Haziqah", 21);
		//System.out.println("\n");
		System.out.println("*************************");
		bday.greeting();
		System.out.println("*************************");

		Wedding wed=new Wedding("Syamil and Syamilah");
		System.out.println("*************************");
		wed.greeting();
		System.out.println("*************************");
	}
}