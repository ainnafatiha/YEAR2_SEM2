public class Pass3
{
	public static void swap(Employee x, Employee y)
	{
		System.out.println();
		System.out.print("Early of method: x=");
		System.out.print(x.getName());
		System.out.println("salary =" + x.getSalary());
		System.out.print("Early of method: y=");
		System.out.print(y.getName());
		System.out.println("salary =" + y.getSalary());

		Employee temp = x;
		x=y;
		y=temp;
		System.out.print("End of method: x= ");
		System.out.print(x.getName());
		System.out.println(" salary =" + x.getSalary());
		System.out.print("End of method: y=");
		System.out.print(y.getName());
		System.out.println("salary=" + y.getSalary());
	}

	public static void main (String[] args)
	{
		System.out.println("\nTesting swap:");
		Employee a=new Employee("Alina", 70000);
		Employee b=new Employee("Badrul",60000);
		System.out.println();
		System.out.print("Before: a= " + a.getName());
		System.out.println("salary =" + a.getSalary());
		System.out.print("Before: b= " + b.getName());
		System.out.print("salary =" + b.getSalary());
		swap(a,b);
		System.out.println();
		System.out.print("After: a=" + a.getName());
		System.out.println("salary = " + a.getSalary());
		System.out.print("After: b=" + b.getName());
		System.out.println("salary =" + b.getSalary());
	}
}