import java.util.Vector;

class Employee2
{
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee2()
	{
		name = " ";
		idNumber = 0;
		department = " ";
		position = " ";
	}

	public Employee2 (String n, int id, String d, String p)
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

public class EmployeeTest2
{
	public static void main (String[]args)
	{
		Employee2 emp1 = new Employee2("Dr. Nor Sabrina",47899,"Accounting","Vice President");
		Employee2 emp2 = new Employee2("En. Ahmad",39119,"IT","Programmer");
		Employee2 emp3 = new Employee2("Prof M Izzudin",666666,"Consultation","Manager");
		Employee2 emp4 = new Employee2("Dr. N Izzati",34521,"Electric&Electronic","CEO");
		Employee2 emp5 = new Employee2("Dr. A Rahman",12321,"PR","Manager");

		Vector <Employee2> vector = new Vector <Employee2> ();

	 	vector.add(emp1);
	 	vector.add(emp2);
	 	vector.add(emp3);
	 	vector.add(emp4);
	 	vector.add(emp5);

	 	for (int i=0; i<4; i++)
	 	{
			System.out.println(vector.get(i).getName() + " ");
			System.out.println(vector.get(i).getId() + " ");
			System.out.println(vector.get(i).getDept() + " ");
			System.out.println(vector.get(i).getPosition() + " ");
			System.out.println("\t");
		}

		for (int j=0; j<4; j++)
		{
			System.out.println(vector.get(j).getName() + " ");
			System.out.println(vector.get(j).getPosition() + " ");
			System. out.println("\t");
		}

		//System.out.println("Size of the vector is : " + vector.size());
	}
}