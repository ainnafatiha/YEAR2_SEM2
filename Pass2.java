public class Pass2
{
	public static void tripleSalary(Employee x)
	{
		x.raiseSalary(3);
	}

	public static void main (String[] args)
	{
		Employee hassan = new Employee ("Hassan", 50000);
		System.out.print("Before: salary = ");
		System.out.println(hassan.getSalary());
		tripleSalary(hassan);
		System.out.print("After: salary = ");
		System.out.println(hassan.getSalary());
	}
}