public class TestVehicle
{
	public static void main (String[]args)
	{
		Car car1 = new Car (45000, 4);
	}
}

class Vehicle
{
	private double cost;

	public Vehicle (double c)
	{
		cost = c;
		System.out.println ("Cost = RM"+cost);
	}
}

class Car extends Vehicle
{
	private int passenger;

	public Car (double