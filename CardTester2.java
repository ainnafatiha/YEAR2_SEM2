import java.util.*;

abstract class Card
{
	protected String recipient;
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

public class CardTester2
{
	public static void main(String[] args)
	{
		KadRaya kad1=new KadRaya("Haziqah");
		kad1.greeting();

		Birthday bday=new Birthday("Haziqah", 21);
		bday.greeting();
	}
}