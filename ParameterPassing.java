public class ParameterPassing {
	public static void main (String [] args) {
		ParameterTester tester = new ParameterTester ();
		int a1=111;
		Num a2=new Num (222);
		Num a3=new Num(333);

		System.out.println ("Before calling change:");
		System.out.println ("a1\ta2\ta3");
		System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n");

		tester.changeValues(a1, a2, a3);

		System.out.println ("After calling change values: ");
		System.out.println ("a1\ta2\ta3");
		System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n");
	}
}

class Num
{
	private int value;
	public Num(int update)
	{
		value=update;
	}

	public void setValue (int update)
	{
		value=update;
	}

	public String toString()
	{
		return value + " ";
	}
}

class ParameterTester
{
	public void changeValues (int f1, Num f2, Num f3)
	{
		System.out.println ("Before changing the values: ");
		System.out.println ("f1\tf2\tf3");
		System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");

		f1=999;
		f2.setValue(888);
		f3=new Num(777);

		System.out.println ("After changing the values: ");
		System.out.println ("f1\tf2\tf3");
		System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");
	}
}