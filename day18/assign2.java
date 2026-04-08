class Student {
    
    String name; 
    int s1, s2, s3;
    int total, avg;

    
    void setName(String n) {
        name = n;
    }

    void setMark(int a, int b, int c) {
        s1 = a;
        s2 = b;
        s3 = c;    
    }

    void totalMark()
    {
        total = s1 + s2 + s3;
    }

    void avg()
    {
        avg = total /3;
    }

    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("total Mark :" +total);
        System.out.println("Average : " + avg);
    }


    void result() {
        if(avg >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

}

public class assign2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Jaydeb Das");
        s1.setMark(65,79,45);
        s1.totalMark();
        s1.avg();
        s1.result();
        s1.display();

    }
}