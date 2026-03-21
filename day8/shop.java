import javax.swing.JOptionPane;

class mrp{
		double mrp;

		void getMrp()
		{
			mrp = Integer.parseInt(JOptionPane.showInputDialog("Enter MRP of the Product"));
		};
	}

class bill extends mrp {
	double gst = 0, dis = 0, bag = 0;

	double total;

	void getGst(double x){
			gst = x;
			//gst = (mrp * x) / 100;
		}

	double calGst()
	{
		return (mrp * gst)/ 100;
	}

	void getDis(double x)
	{
		dis = x;
		// dis = (mrp * dis)/ 100;
	}

    double calDis()
    {
		 return (mrp * dis)/ 100;

    }

	void getbag(double x)
	{
		bag = x;
	}

	void cal()
	{
		total = (mrp + calGst() + bag) - calDis();
	}

	void display()
	{
	   JOptionPane.showMessageDialog(null,"MRP : ₹" +mrp+ "\n" +gst+ " % GST : ₹" +calGst()+ "\n" +dis+ "% Discount : ₹" +calDis()+ "\n Bag : ₹" +bag+ "\n----------------------------------------\n"+" Total Amount : ₹" +total);
	}

}


public class shop{
	public static void main(String[] args)
	{
		bill b1 = new bill();

		b1.getMrp();
        b1.getDis(10);
        b1.getGst(20);
        b1.getbag(17);
        b1.cal();
        b1.display();

	}
}