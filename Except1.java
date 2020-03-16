import java.io.*;
public class Except1
{
	public static int num, denom;
	public static double out=0.0;

	public static void main (String[] a) throws IOException
	{
		BufferedReader st=new BufferedReader (new InputStreamReader(System.in));
		test1();
	}

	public static void test1()
	{
		try
		{
			test2();
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Arithmetic problem!");
			System.out.println(ex.getMessage());
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Wrong data type");
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			System.out.println("Input problem");
		}
	}

	public static void test2() throws IOException
	{
		BufferedReader st= new BufferedReader (new InputStreamReader(System.in));
		num=Integer.parseInt(st.readLine());
		denom=Integer.parseInt(st.readLine());
		out=num/denom;
		System.out.println(out);
	}
}