public class name2{
   public static void main(String[] args)
   {
        String name = "subha deb das";
        String arr[] = name.split(" ");
        String newName = "";
        for(int i = 0; i<arr.length-1; i++)
        {
            newName = newName + arr[i].charAt(0) + ". ";
        }
        newName = newName + arr[arr.length-1];
        System.out.println("new name is:");
        System.out.println(newName);

   }   
}