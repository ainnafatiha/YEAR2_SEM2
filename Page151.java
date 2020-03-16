public class Page151
{
	public static void main (String args[])
	{
		double[] realArray = new double[]{4.2, 6.5, 2.3, 8.7, 3.9, 1.4};
		printAll(realArray);
		System.out.println("\nIncrease value by 5\n");
		increaseAll(realArray);
		System.out.println("\nFind the smallest value\n");
		findSmallest(realArray);
	}

	public static void printAll(double[] realArray)
	{
		for(double val: realArray)
		{
			System.out.println(val);
		}
	}

	public static void increaseAll(double[] realArray)
	{
		for (int i=0; i<6; i++)
		{
			System.out.println(realArray[i]+5);
		}
	}

	public static void findSmallest(double[] realArray)
	{
		double smallest = realArray[0];
		for(int i=1; i<realArray.length; i++);
			if (realArray[i]<smallest)
			smallest=realArray[i];
			System.out.println(smallest);
	}
}





