class A 
{
    int a,b;
    void input(int x, int y)
    {
        a = x;
        b = y;
    }
}

class B extends A
{
    int s;
    void add()
    {
        s = a+b;
    }
    void display()
    {
        System.out.println("add is"+s);
    }
}

public class inheri
{
    public static void main(String[] args) {
        B b = new B();
        b.input(11, 11);
        b.add();
        b.display();
    }
    

}