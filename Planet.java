public enum Planet
{
	MERCURY (3.303e+23, 2.4397e6),
	VENUS (3.896e+24, 6.0518e6),
	EARTH (5.976e+24, 6.37814e6),
	MARS (6.421e+23, 3.3972e6),
	JUPITER (1.9e+27, 7.1492e7),
	SATURN (5.686e+25, 6.0268e7),
	URANUS (80686e+26, 2.5559e+7),
	NEPTUNE (1.024e+26, 2.4746e+7);

	private final double mass;
	private final double radius;
	private double mass()
	{
		return mass;
	}
	private double radius()
	{
		return radius;
	}

	Planet (double mass, double radius)
	{
		this.mass = mass;
		this.radius = radius;
	}

	public static final double G = 6.67300E-11;

	double surfaceGravity()
	{
		return G*mass/(radius*radius);
	}

	double surfaceWeight(double otherMass)
	{
		return otherMass*surfaceGravity();
	}

	public static void main (String[] args)
	{
		double earthWeight = 175;
		double mass = earthWeight/EARTH.surfaceGravity();
			for (Planet p:Planet.values())
			{
				System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
			}
	}
}