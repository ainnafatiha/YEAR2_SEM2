public class TestClass2
{
	public static void main (String[]args)
	{
		Bilik1 kls = new Bilik1 ("Cuba");

		System.out.println (kls.getData1());
		System.out.println (kls.metod1());
	}
}

abstract class Kelas1
{
	private String data1;

	public Kelas1() { }

	public Kelas1 (String n)
	{
		data1 = n;
	}

	public abstract String metod1();

	public String getData1()
	{
		return data1;
	}
}

class Bilik1 extends TestClass2
{
	private String data1;

	public Bilik1() { }

	public Bilik1 (String n)
	{
		data1 = n;
	}

	public String metod1()
	{
		return "Hello World";
	}

	public String getData1()
	{
		return data1;
	}
}