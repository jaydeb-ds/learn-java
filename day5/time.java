
class timer {
	int hr,min,sec;

	timer(){
		hr = 0;
		min = 0;
		sec = 0;
		}

	void display(){
		System.out.println(hr+" hours " +min+ " minutes " +sec+ " seconds");
	}

}

public class time{
		public static void main(String[] args)
		{
			timer t1 = new timer();
			t1.display();
		}
	}