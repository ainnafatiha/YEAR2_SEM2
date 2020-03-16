//Program 2.7
class Trial
{
	private int a;
	private String b;

	Trial (int _a)
	{
		a=_a;
		b=_b;
	}

	public void setAB(int num, String str)
	{
		a=num;
		b=str;
	}

	private int getA ()
	{
		return a;
	}

	public void show ()
	{
		System.out.println ("A: " + getA ());
		System.out.println ("B: " + b);
	}
}

class TrialTest
{
	public static void main (String[]args)
	{
		Trial ac=new Trial (5, "Five");
		ac.a=10;
		ac.b="Ten";
		ac.setAB(6,"Six");
		getA();
		ac.show();
		show();
		ac.getA();
	}
}