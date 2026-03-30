public class asc {
    public static void main(String[] args) {
        int arr[] = {88,22,11,55,44,99,66};
        int t;
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if (arr[i]>arr[j]) 
                {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("The Numbers in are ");
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
