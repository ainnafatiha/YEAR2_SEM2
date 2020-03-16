class BusinessAssociate extends Person
{
	private String jobtitle;
	private String companyName;

	public BusinessAssociate()

	public BusinessAssociate(Address a, String jt, String cn, String n, String p)
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
