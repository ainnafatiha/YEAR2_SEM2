	public class TestWrapper2
	{
		public static void main (String[] args)
		{
			double year = 1957;
			Double obj1;
			obj1 = year;

			System.out.println("\nObject 1-obj1:\t"+obj1);

			Character obj3 = new Character('A');
			char num3;
			num3 = obj3;//unboxing

			System.out.println("Number,num:\t" + num3);
			System.out.println("Object 3-obj3:\t\n" + obj3);
		}
}














