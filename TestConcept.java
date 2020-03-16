class Concept
{

	void tryMethod()
	{
		System.out.println ("No parameters");
	}

	void tryMethod (int a, int b)
	{
		System.out.println ("a and b :" + a + " " + b);
	}

	void tryMethod (double a)
	{
		System.out.println ("Inside test (double) a: " + a );
	}
}

class TestConcept
{
	public static void main (String args[])
	{
		Concept ob = new Concept();
		int i=88;
		ob.tryMethod();
		ob.tryMethod(10,20);
		ob.tryMethod(i);
		ob.tryMethod(122.2);
	}
}