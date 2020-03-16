import java.io.*;
import java.util.*;

class TestInput3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("write1.txt"));
		PrintWriter writer = new PrintWriter(new FileWriter("write2.txt"));

		String name;
		float price;

		String str;
		String month; //declare input month
		System.out.print("Please enter the month: ");
		Scanner m = new Scanner(System.in);
		month = m.nextLine();

		writer.println("******************************");
		writer.println("	Sale for " + month);
		writer.println("******************************");

		int i=1;

		while((str = reader.readLine())!=null)
		{
			String[] p = str.split("\t");//
			price = Float.parseFloat(p[0]);//something to change to string
			name = p[1];

			writer.printf("%2d. %-20s RM%.2f%n", i, name,price);
			//writer.println(+ name + "	RM" + price);
			i++;
		}
		reader.close();
		writer.close();
	}
}
