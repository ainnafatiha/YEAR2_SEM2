import java.util.Scanner;
public class Question3
{
	public static void main (String args[])
	{
		Scanner s = new Scanner (System.in);
		double [] score = new double [6];

		//assign the value
		score[0]=5.6;
		score[2]=7.8;
		score[5]=10.2;

		//input data from keyboard
		System.out.println("Element at index 2: ");
		score[1]=s.nextDouble();

		//display first and second element
		System.out.println("Element at index 0: " + score[0]);
		System.out.println("Element at index 1: " + score[1]);
	}
}


