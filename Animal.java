public class Animal
{
	public void eat()
	{
		System.out.println("All animals need to eat");
	}
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("Cats eats fish, " + "and Whiskies");
	}

	public void sound()
	{
		System.out.println("Cat say meow!");
	}
}