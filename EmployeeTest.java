import java.util.ArrayList;

class Employee
{
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee()
	{
		name = " ";
		idNumber = 0;
		department = " ";
		position = " ";
	}

	public Employee (String n, int id, String d, String p)
	{
		name = n;
		idNumber = id;
		department = d;
		position = p;
	}

	public void setName (String setN)
	{
		name = setN;
	}

	public String getName ()
	{
		return name;
	}

	public void setId (int setI)
	{
		idNumber = setI;
	}

	public int getId ()
	{
		return idNumber;
	}

	public void setDept (String setD)
	{
		department = setD;
	}

	public String getDept ()
	{
		return department;
	}

	public void setPosition (String setP)
	{
		position = setP;
	}

	public String getPosition ()
	{
		return position;
	}
}

public class EmployeeTest
{
	public static void main (String[]args)
	{
		Employee emp1 = new Employee("Dr. Nor Sabrina",47899,"Accounting","Vice President");
		Employee emp2 = new Employee("En. Ahmad",39119,"IT","Programmer");
		Employee emp3 = new Employee("Prof M Izzudin",666666,"Consultation","Manager");
		Employee emp4 = new Employee("Dr. N Izzati",34521,"Electric&Electronic","CEO");
		Employee emp5 = new Employee("Dr. A Rahman",12321,"PR","Manager");

		ArrayList <Employee> arraylist = new ArrayList <Employee> ();

	 	arraylist.add(emp1);
	 	arraylist.add(emp2);
	 	arraylist.add(emp3);
	 	arraylist.add(emp4);
	 	arraylist.add(emp5);

	 	for (int i=0; i<4; i++)
	 	{
			System.out.println(arraylist.get(i).getName() + " ");
			System.out.println(arraylist.get(i).getId() + " ");
			System.out.println(arraylist.get(i).getDept() + " ");
			System.out.println(arraylist.get(i).getPosition() + " ");
			System.out.println("\t");
		}

		for (int j=0; j<4; j++)
		{
			System.out.println(arraylist.get(j).getName() + " ");
			System.out.println(arraylist.get(j).getPosition() + " ");
			System. out.println("\t");
		}

		System.out.println("Size of the arraylist is : " + arraylist.size());
	}
}


