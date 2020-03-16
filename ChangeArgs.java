public class ChangeArgs
{
	public static double average(double ... num)
	{
		double tot = 0.0;
		for(double db:num)
			tot += db;
		return tot/num.length;
	}

	public static void main(String [] args)
	{
		double n1=5.0;
		double n2=7.0;
		double n3=8.0;
		double n4=9.0;

		System.out.printf("Average of n1 and n2 is %.2f\n",average(n1,n2));
		System.out.printf("Average of n1, n2 and n3 is %.2f\n",average(n1,n2,n3));
		System.out.printf("Average of n1, n2, n3 and n4 is %.2f\n",average(n1,n2,n3,n4));
	}
}