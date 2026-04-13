class A {
    int a = 20;
    int b = 10;
}

// Child class B (Addition)
class B extends A {
    void add() {
        System.out.println("Add: " + (a + b));
    }
}

// Child class C (Subtraction)
class C extends A {
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Child class D (Division)
class D extends A {
    void div() {
        System.out.println("Division: " + (a / b));
    }
}

public class TestHierarchical {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();

        obj1.add();
        obj2.sub();
        obj3.div();
    }
}