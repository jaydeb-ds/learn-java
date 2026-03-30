public class name {
   public static void main(String[] args)
   {
        String name = "Jay Deb Das";
        String arr[] = name.split(" ");
        String newName = "";
        for(int i = 0; i<arr.length-1; i++)
        {
            newName = newName + arr[i].charAt(0) + ". ";
        }
        newName = newName + arr[arr.length-1];
        System.out.println(newName);
   
   }   
}