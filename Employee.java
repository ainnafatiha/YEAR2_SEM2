public class Employee
{
	private String name;
	private int salary;

	public Employee(String n, int s)
	{
		name=n;
		salary=s;
	}

	public void raiseSalary(int t)
	{
		salary=t*salary;
	}

	public String getName ()
	{
		return name;
	}

	public int getSalary()
	{
		return salary;
	}
}