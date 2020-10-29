/*

 Given a array with n elements print the number of occurrences of that number each number in that array. The order of number doesn’t matter. You can reorder the elements.
Example : [2,1,3,2,2,5,8,9,8]
Output:
2-3
1-1
3-1
5-1
8-2
9-1

*/

import java.util.Arrays;

public class NumberOccuranceInArray {
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "-->" + count);
        }
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{2,1,3,2,2,5,8,9,8};
        int n = arr.length;
        countFreq(arr, n);
    }
}
