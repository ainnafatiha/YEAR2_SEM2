public class Animal2
{
	public void eat()
	{
		System.out.println("All animals need to eat");
	}
}

class Cow extends Animal2
{
	public void eat()
	{
		System.out.println("Cow eats grass");
	}

	public void sound()
	{
		System.out.println("Cow says moo1");
	}
}