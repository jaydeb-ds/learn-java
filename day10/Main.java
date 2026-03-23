// interface A {
	
//     void mul(int a, int b){
//         System.out.println(a*b);
//     }
// }

// interface B{
//     void add(int a, int b)
//     {
//         System.out.println(a*b);
//     }
// }

// class result implements A,B
// {
//     public void show()
//     {
//         System.out.println(" Result is : \n");
//     }
// }

// public class multiple_inheri {
//     public static void main(String[] args) {
//         result r1 = new result();
//         // r1.add(22,44);
//         // r1.mul(33,4);
//         r1.show();
//     }
// }

interface Add {

    default void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

interface Multiply {

    default void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
}


class Calculator implements Add, Multiply {
    // No need to override methods (already defined)
     public void show()
    {
        System.out.println(" Result is : \n");
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add(10, 5);
        obj.multiply(10, 5);
        obj.show();
    }
}