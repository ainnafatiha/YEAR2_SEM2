import java.util.Scanner;
public class BookApplication
{
	public static void main (String args[])
	{
		Scanner s = new Scanner (System.in);
		Book[] bookArray = new Book[5];
		for(int 1=0; i<5; i++)
		{
			System.out.println("Title: ");
			String t = s.nextString();
			System.out.println("Author: ");
			String a = s.nextString();
			System.out.println("ISBN : ");
			String i = s.nextString();
		}
}
