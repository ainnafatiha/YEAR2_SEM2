import java.io.*;

class TestInput2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader ("sample1.txt"));

		PrintWriter writer = new PrintWriter (new FileWriter("write1.txt"));

		String name;
		float price;

		price = new Float(reader.readLine()).floatValue();

		while (price !=0)
		{
			name = reader.readLine();
			writer.println(price + "\t" + name);
			price = new Float (reader.readLine()).floatValue();
		}
		reader.close();
		writer.close();
	}
}