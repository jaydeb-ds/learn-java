class Student {
    String name;
    int age;

    // Constructor with one parameter
    Student(String n) {
        name = n;
        age = 18;
    }

    // Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println( name + ", " + age);
    }
}

public class TestOverload {
    public static void main(String[] args) {
        Student s1 = new Student("Jay");       // one parameter
        Student s2 = new Student("Dev", 22);    // two parameters

        s1.display();
        s2.display();
    }
}