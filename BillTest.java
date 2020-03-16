//import java.util,*;
public class BillTest
{
	public static void main (String[] args)
	{
		Bill mum = new Bill(130,100);
		Bill sister = new Bill(200,50);
		Bill family = new Bill(0,0);
		family=family.calculateTotal(mum,sister);
		System.out.println("Total bill: ");
		family.calculateBill();
	}
}

class Bill
	{
		int airtime, totalSms;
		double totalBill;
		final double callrate = 0.25;
		final double smsrate = 0.05;

		public Bill(int a, int s)
		{
			airtime = a;
			totalSms = s;
		}

		public Bill calculateTotal(Bill x, Bill y)
		{
			Bill calcTotal = new Bill(0,0);
			calcTotal.airtime = x.airtime + y.airtime;
			calcTotal.totalSms = x.totalSms + y.totalSms;
			return calcTotal;
		}

		public void calculateBill()
		{
			totalBill = airtime*callrate+totalSms+smsrate;
			System.out.println(totalBill);
		}
	}



