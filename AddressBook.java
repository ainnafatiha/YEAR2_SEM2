class AddressBook
{
	private Person[] entry;
	private int count;
	private int x=0;

	public AddressBook()
	{}

	public AddressBook(int count)
	{
		this.count=count;
		entry=new Person[count];
	}

	public void addPerson(Person ps)
	{
		entry[x]=ps;
		x++;
	}

	public void displayAddressBook()
	{
		for(int i=0; i<x; i++)
		{
			Person t=(Person)entry[i];
			t.displayPerson();
			System.out.println("\n");
		}
	}
}
