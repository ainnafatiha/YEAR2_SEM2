public abstract class Vegetable
{
	private int weight;
	public Vegetable (int w)
	{
		weight = w;
	}
	public abstract double calcWeight ();
	public int getWeight()
	{
		return weight;
	}
}

class Cabbage extends Vegetable
{
	public Cabbage (int w)
	{
		super(w);
	}
	public double calcWeight()
	{
		return 5*super.getWeight();
	}
}