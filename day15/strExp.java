

public class strExp {
    public static void main(String[] args)
    {
        String name = "jaydeb";
        try {
            char c = name.charAt(10);
            System.out.println("char is "+c);
        } catch (Exception e) {
            System.out.println("String index is out of range");
        }
        finally
        {
            System.out.println("program Continue....");
        }
       
    } 
}
