class box{

    int a, b, area;

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

public class cons2 {
    public static void main(String[] args) {
        box b1 = new box(7);
        b1.display();

        box b2 = new box(4,6);
        b2.display();
    }
}
