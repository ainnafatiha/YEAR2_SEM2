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

	public void EmployeeDetails (String n, int id, String d, String p)
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