// constructor in java
class axis{
    int x, y;
    
    // type 1 default constructor 
    axis() {
        x=1;
        y=0;
    }
    // --------------------------

    // Type 2 parameterized constructor 
    axis(int a, int b)
    {
        x = a;
        y = b;
    }
    // ------------------------
    void display()
    {
        System.out.println("Value of X : " +x+ " Value of Y : "+y);
    }
}

public class cons1{
    public static void main(String[] args)
    {
        axis a1 = new axis();
        a1.display();
        axis a2 = new axis(6,7);
        a2.display();

    }
}
