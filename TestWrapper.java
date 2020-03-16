public class TestWrapper
{
	public static void main (String[] args)
	{
		double year = 1957;
		Double obj1;
		obj1 = year;

		System.out.println("\nObject 1-obj1:\t"+obj1);

		Double obj2 = new Double(1956);
		double num2;
		num2 = obj2;//unboxing

		System.out.println("Number,num:\t" + num2);
		System.out.println("Object 2-obj2:\t\n" + obj2);

	}
}