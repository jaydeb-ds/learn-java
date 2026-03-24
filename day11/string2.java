public class string2
{
	public static void main(String[] args)
	{
		String s1 = "jaydeb";
		String s2 = "JayDeb";

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.endsWith("eb"));

		char[] c= s1.toCharArray();
		System.out.println(c[1]);

  		System.out.println(s1.replace("a","o"));
  		String s3 = "	student     ";
  		System.out.println(s3);
  		String s4 = s3.trim();
  		System.out.println(s4);

	}

}
