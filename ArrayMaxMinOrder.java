public class ArrayMaxMinOrder {
    static int[] rearrange(int arr[], int n)
    {
        int temp[] = new int[n];
        int small=0, large=n-1;
        boolean flag = true;

        for (int i=0; i<n; i++)
        {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];

            flag = !flag;
        }
        return temp;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        int n = arr.length;

        System.out.println("Original Array: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        arr = rearrange(arr,n);

        System.out.println("Modified Array: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
