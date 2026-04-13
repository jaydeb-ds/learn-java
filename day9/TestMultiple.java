
interface B {
   default int add(int x, int y) {
    int s = x + y;
    return s;       
   }
}

interface C {
    default int multiply(int x, int y) {
        int m = x * y;
        return m;
    }
}

// Class implementing multiple interfaces
class D implements  B, C {
    void show() {
        System.out.println("sum is : " + add(12,44));
        System.out.println("Multiplication is : " + multiply(12,44));
    }
}

public class TestMultiple {
    public static void main(String[] args) {
        D obj = new D();

        obj.show();
    }
}