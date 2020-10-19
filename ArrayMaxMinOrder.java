/*
2. Write a program to sort the elements in odd positions in descending order and elements in ascending order

Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
*/

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
