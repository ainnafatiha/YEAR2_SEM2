public class Product
{

	private String code;
	private double cost;
	private int quantity;

	public static void main (String [] args)
		{
			System.out.println(" Start Product");
		}

	public Product()
	{
		System.out.println("Start Product");
	}

	public Product(String code, double cost, int quantity)
	{
		code=code;
		cost=cost;
		quantity=quantity;}

	public String getCode()
	{
		return code;
	}

	public double getCost()
	{
		return cost;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double calcCost()
	{
		return cost*quantity;
	}


}