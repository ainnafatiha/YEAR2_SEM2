class Person
{
	private String name;
	private String phone;
	private Address address;

	public Person();

	public Person(String n, String p, Address a)
	{
		this.name=n;
		this.phone=p
		address=a;
	}

	public void setName(String setN)
	{
		this.name=setN;
	}

	public void setPhone(String setP)
	{
		this.phone=setP;
	}

	public String getName()
	{
		return name;
	}

	public String getPhone()
	{
		return phone;
	}

	public void displayPerson()
	{
		System.out.println("Name: " + getName());
		System.out.println("Phone: " + getPhone());
		System.out.println("Address: " + address.getFullAddress());
	}
}
