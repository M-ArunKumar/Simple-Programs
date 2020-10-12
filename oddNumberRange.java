 /**
 * To find the odd numbers in between the range.
    Input:
    2
    15
    Output:
    3,5,7,9,11,13
*
 */

import java.util.Scanner;

public class oddNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range: ");
        int startingNumber = sc.nextInt();

        System.out.println("Ending Range: ");
        int endingNumber = sc.nextInt();

        for (int i=startingNumber;i<endingNumber;i++){
            if (i % 2 == 1){
                System.out.print(i);
            }
        }
    }
}
