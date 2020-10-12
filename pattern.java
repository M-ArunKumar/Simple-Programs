import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int rows = sc.nextInt();
        System.out.println("Printing the pattern--->");

        for (int i=1;i<rows;i++){
            // Print space in decreasing order
            for (int j=rows;j>i;j--){
                System.out.print(" ");
            }

            // Print star in increasing order
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
       }
    }

