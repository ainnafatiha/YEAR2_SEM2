enum Satay{MUTTON, OSTRICH, CHICKEN, BEEF}

public class SatayTest
{
	Satay satay;

	public SatayTest(Satay satay)
	{
		this.satay=satay;
	}

	public void order()
	{
		switch (satay)
		{
			case MUTTON: System.out.println("Mutton Satay - Fabulous");
			System.out.println("Price is RM0.60/each");
			break;

			case OSTRICH: System.out.println("Ostrich Satay ");
			System.out.println("Fow low cholestrol diet");
			System.out.println("Price is RM1.00/each");
			break;

			case CHICKEN: System.out.println("Beef Satay - Grandma loves it!");
			System.out.println("Price is RM0.80/each");
			break;

			default: System.out.println("Wrong choice");
			break;
		}
	}

	public static void main(String[]args)
	{
		SatayTest order1=new SatayTest(Satay.OSTRICH);
		order1.order();

	}
}
