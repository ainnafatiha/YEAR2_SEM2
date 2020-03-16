import java.util.Scanner;
enum Vehicle {MOTORCYCLE, SEDAN_CAR, MPV_CAR, VAN}

public class ParkingTest
{
	Parking parking;

	private double price;

	public ParkingTest(Parking parking)
	{
		this.parking=parking;
	}

	public void price()
		{
			switch (pk)
			{
				case MOTORCYCLE: price = 1.00;
								System.out.println("MOTORCYCLE");
								System.out.println("RM1.00/hour");
				break;

				case SEDAN_CAR: price = 2.00;
								System.out.println("SEDAN_CAR");
								System.out.println("RM2.00/hour");
				break;

				case MPV_CAR: price = 3.00;
								System.out.println("MPV_CAR");
								System.out.println("RM3.00/hour");
				break;

				case VAN: price = 1.00;
								System.out.println("VAN");
								System.out.println("RM3.00/hour");
				break;

				default: System.out.println("Wrong choice!");
				break;
				calculateFees();
			}
		}
}

	public void calculateFees()
	{
		Scanner fee = new Scanner(System.in);
		System.out.print("Enter hour: ");
		double hrs = input.nextDouble();
		System.out.println("Total parking fee: \n");
		double fee = hrs*price;
		System.out.println(fee);
	}
}

public static void main (String[]args)
{
	Scanner parking = new Scanner(System.in);
	String carName;
	System.out.println("PARKING FEE PAYMENT \t");
	System.out.println("1. MOTORCYCLE \t");
	System.out.println("2. SEDAN_CAR \t");
	System.out.println("3. MPV_CAR \t");
	System.out.println("4. VAN \t");
	System.out.println("\t");
	System.out.println("Enter the choice\t");

	int ch = input.nextInt();

	switch(ch)
	{
		case 1: name = "MOTORCYCLE";
				Parking parking1 = new Parking (Vehicle.valueOf(name));
				parking1.calculateFees();
		break;

		case 1: name = "SEDAN_CAR";
				Parking parking2 = new Parking (Vehicle.valueOf(name));
				parking2.calculateFees();
		break;

		case 1: name = "MPV_CAR";
				Parking parking3 = new Parking (Vehicle.valueOf(name));
				parking3.calculateFees();
		break;

		case 1: name = "VAN";
				Parking parking4 = new Parking (Vehicle.valueOf(name));
				parking4.calculateFees();
		break;
	}
}





