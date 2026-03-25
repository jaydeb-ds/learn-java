
public class asc {
    public static void main(String[] args) {
        int[] nums = {20,50,10,30,40};
        int temp;
        // System.out.println(nums.length);
        for(int i=0; i<5; i++)
        {
            for(int j = i+1; j<5; j++)
            {
                if(nums[i] > nums[j])
                {
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        
            System.out.println(nums[i]+" ");
        }
    }    
}
