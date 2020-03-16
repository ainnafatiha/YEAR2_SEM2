class PersonalFriend extends Person
{
	private String message;

	public PersonalFriend()
	{}

	public PersonalFriend(String m, String n, String p, Address a)
	{
		super(p,n,a)
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
