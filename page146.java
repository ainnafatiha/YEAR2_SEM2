public class page146
{
	public static void main (String args[])
	{
		int[] numArray = {4, 5, 2, 8, 9, 10};

		System.out.println("Before: ");
		for (int i=0; i<6; i++)
		{
			System.out.println(numArray[i]);
		}

		System.out.println("After adding 5: ");
		for (int i=0; i<6; i++)
		{
			System.out.println(numArray[i]+5);
		}

		System.out.println("Backward: ");
		for (int i=6-1; i>=0; i--)
		{
			System.out.println(numArray[i]);
		}
	}
}
