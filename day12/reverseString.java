
public class reverseString {
    public static void main(String[] args)
    {
		String org = "jaydeb";
		String rev = "";

		int len = org.length();
		char[] arr = org.toCharArray();

		for(int i = len-1; i>=0;i--)
		{
			rev = rev + arr[i];
		}
		System.out.println(rev);
	}
}
