import java.util.*;

class Address
{
	private String street;
	private String city;
	private String state;

	public Address()
	{}

	public Address(String sr, String c, String st)
	{
		this.street=sr;
		this.city=c;
		this.state=st;
	}

	public String getFullAddress()
	{
		return street + ", " + city + ", " + state;
	}
}

class Person
{
	private String name;
	private String phone;
	private Address address;

	public Person()
	{}

	public Person(String n, String p, Address a)
	{
		this.name=n;
		this.phone=p;
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

	public void add(Person ps)
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

class PersonalFriend extends Person
{
	private String message;

	public PersonalFriend()
	{}

	public PersonalFriend(String p, String n, Address a, String m)
	{
		super(p,n,a);
		message=m;

	}

	public String getMessage()
	{
		return message;
	}

	public void displayPerson()
	{
		super.displayPerson();
		System.out.println("Message: " + getMessage());
	}
}

class BusinessAssociate extends Person
{
	private String jobtitle;
	private String companyName;

	public BusinessAssociate()
	{}

	public BusinessAssociate(String n, String p, Address a, String jt, String cn)
	{
		super(n, p, a);
		jobtitle=jt;
		companyName=cn;
	}

	public String getJobTitle()
	{
		return jobtitle;
	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void displayPerson()
	{
		super.displayPerson();
		System.out.println("Job Title: " + getJobTitle());
		System.out.println("Company: " + getCompanyName());
	}
}

public class AddressBookApp
{
	public static void main (String[] args)
	{
		AddressBook book1 = new AddressBook(10);
		Address ad1 = new Address("No 2 Jalan Mawar", "Skudai", "Johor Bahru");
		Address ad2 = new Address("Block 1-7", "Cheras", "Kuala Lumpur");
		Address ad3 = new Address("202-2 Jalan Bendahara", "Muar", "Johor Bharu");

		Person newfriend1 = new Person("Mr. X", "555-1212", ad1);
		book1.add(newfriend1);

		BusinessAssociate b1;
		b1 = new BusinessAssociate("Mr Yeo", "019-8976", ad2, "General Manager", "Motorola");
		book1.add(b1);

		PersonalFriend f1 = new PersonalFriend("Mrs. Zyda", "012-8796", ad3, "My schoolmate");
		book1.add(f1);

		book1.displayAddressBook();
	}
}

