import java.util.Scanner;
public class TestYears
{
	public static void main (String[] args)
	{
		int thisYear=2008;
		int prevYear;
		int age, yearService;

		Scanner kb = new Scanner (System.in);
		System.out.print ("Year born: ");
		prevYear = kb.nextInt();
		age = calcYears(thisYear, prevYear);
		System.out.println ("Your age: " + age);
	}

	public static int calcYears (int current, int previous)
	{
		return current - previous;
	}
}