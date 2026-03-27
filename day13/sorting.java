import java.util.Scanner;

class sort
{
	void ase(int[] nums)
	{
		int t;
		int n = nums.length;

		for(int i = 0; i<n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				if(nums[i] > nums[j])
				{
					t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
		}

	}

}


public class sorting
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		sort s = new sort();
		int[] num;

		System.out.println("Enter the Number of Integer");
		int n = sc.nextInt();
		num = new int[n];

		for(int i=0; i<n; i++ )
		{
            num[i] = sc.nextInt();
		}

		s.ase(num);
        for(int i = 0; i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }

	}
}