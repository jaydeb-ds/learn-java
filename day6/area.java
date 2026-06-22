class box{

    int a, b, area;

    box()
    {
        a = 0;
        b = 0;
        area = 0;
    }

    box(int x)
    {
        a = x;
        area = a*a;
    }

    box(int x, int y){
        a = x;
        b = y;
        
        area = a * b;
    }

    void display()
    {
        System.out.println("Area of the box is " +area);
    }
}

public class area {
    public static void main(String[] args) {
        box b1 = new box();
        b1.display();

        box b2 = new box(4);
        b2.display();

        box b3 = new box(5, 6);
        b3.display();
        }
}
