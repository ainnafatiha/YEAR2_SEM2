public class Test1
{
	public static void main(String[] args)
	{
		T t1 = new T();
		System.out.print("t1's static i=" + t1.i);
		System.out.println(" and instance j =" + t1.j);
		T t2 = new T();
		System.out.print ("t2's static i=" + t2.i);
		System.out.println(" and instance j=" + t2.j);
		T t3 = new T ();
		System.out.print("t3's static i= " + t2.i);
		System.out.println(" and instance j = " + t2.j);
	}
}
	class T
	{
	static int i = 0;
	int j = 0;
	T()
	{
		i++;
		j++;
	}
	}
