public class Temperature {

	private double celcius;
	private double fahrenheit;

	public static void main (String [] args)
		{
			System.out.println("Temperature Converter");
		}

	public Temperature()
	{
		System.out.println("Temperature");
	}

	public Temperature (double celcius)
	{
		celcius=celcius;
	}

	public void setCelcius (double c)
	{
		celcius=c;
	}

	public void setFahrenheit (double f)
	{
		fahrenheit=f;
	}

	public double getCelcius()
	{
		return celcius;
	}

	public double getFahrenheit()
	{
		return fahrenheit;
	}

	public double convert()
	{
		return fahrenheit = celcius*(9f / 5)+32;
	}
}