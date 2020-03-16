public class BillTest2
{
	public static void main (String[]args)
	{
		Bill mum=new Bill(130,100);
		Bill sister=new Bill(200,50);
		Bill family=new Bill(0,0);
		family=family.calculateTotal(mum,sister);
		System.out.println("Total bill: ");
		family.calculateBill();
	}
}