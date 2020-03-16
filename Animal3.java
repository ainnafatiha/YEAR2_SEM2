public class Animal3
{
	protected String kind;
	public Animal3() {};

	public String toString()
	{
		return "I am a " + kind + "and I go " + ((Speakable)this).speak();
	}
}