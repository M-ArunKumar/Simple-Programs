import java.util.Scanner;

public class CheckSumOfArray {
    static void solution(int arr[],int sum){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum){
                    count++;
                    System.out.println("The pair for given sum " +sum+ " is " + arr[i] +","+arr[j]);
                }
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        int arr[] = {1, 2, 4, 3, 5, 6};
        solution(arr,sum);
    }
}
