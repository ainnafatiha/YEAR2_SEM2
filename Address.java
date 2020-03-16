class Address
{
	private String street;
	private String city;
	private String state;

	public Address();

	public Address(String sr, String c, String st)
	{
		this.street=sr;
		this.city=c;
		this.state=st;
	}

	public String getFullAddress()
	{
		System.out.println("Street " + street + "City " + city + "State " + state)
	}
}
