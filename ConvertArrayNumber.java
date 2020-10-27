/*

2. Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.

Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0

*/

public class ConvertArrayNumber {
    static void pushZeros(int arr[],int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while (count < n){
            arr[count++] = 0;
        }
    }

    static void solution(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            if ((arr[i] != 0) && (arr[i] == arr[i+1])){
                arr[i] = 2 * arr[i];
                arr[i+1] = 0;
                i++;
            }
        }
        pushZeros(arr,n);
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        int n = arr.length;

        System.out.println("Original Array: ");
        printArray(arr,n);

        solution(arr,n);

        System.out.println("Modified Array: ");
        printArray(arr,n);
    }
}
