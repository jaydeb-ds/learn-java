import javax.swing.JOptionPane;

class mrp{
		double mrp;

		void getdata()
		{
		//  n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));

			mrp = Integer.parseInt(JOptionPane.showInputDialog("Enter the MRp"));
			// mrp = x;
		}

		void display()
		{
			System.out.println("MRP = "+mrp);
		}
	}

class bill extends mrp
{
	double gst = 0, delivery = 0, discount = 0;
	double total;

	void getGst(double x)
	{
		gst = (mrp * x) /100;
	}

	void getdDelivery(int x)
	{
		delivery = x;
	}

	void getDiscount(int x)
	{
		discount = (mrp * x) / 100;
	}

	void cal()
	{
		total = (mrp + delivery + gst) - discount;
	}

	void display()
	{
		JOptionPane.showMessageDialog(null,"MRP : "+mrp+  " \nGST :" +gst+ " % " +" \nDelivery Charge : "+delivery+ " \nDiscount : " +discount+ " \nTotal Amount " +total);
		System.out.println("MRP = "+mrp);
		System.out.println("GST = "+gst);
		System.out.println("Delivery Charges = "+delivery);
		System.out.println("Discount = "+discount);
		System.out.println("Total Bill = "+total);
	}

}

public class shop{
			public static void main(String[] args) {
				bill b1 = new bill();
				b1.getdata();
				b1.getGst(18);
				b1.getdDelivery(50);
				b1.getDiscount(20);
				b1.cal();
				b1.display();
			}
		}





