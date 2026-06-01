public class exp {
    public static void main(String[] args) {
        int a = 10, b=0;
        try
        {
            int d = a/b;
            System.out.println("result "+d);
        }
        catch(Exception ex)
        {
            System.out.println("can't divided by zero");
        }
    }
}
