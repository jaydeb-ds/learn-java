class A {
    int a, b, c;

    void inputA(int x) {
        a = x;
    }
}
 
class B extends A {
    void inputB(int y) {
        b = y;
    }
}

class C extends B {

    void sum() {
        c = a + b;
    }

    void display() {
        System.out.println("Sum : " + c);
    }
}

public class multi_level_inheri {
    public static void main(String[] args) {
        C c1 = new C();
        c1.inputA(33);
        c1.inputB(45);
        c1.sum();
        c1.display();

    }
}
