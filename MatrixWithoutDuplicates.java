import java.util.Scanner;

public class MatrixWithoutDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter the values in matrix: ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println( m +" * "+ n + " Matrix values are: ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The Unique Matrix is: ");
        for (int i = 0;i<m-1;i++){
            for (int j = 0;j<n;j++){
                if (matrix[i] != matrix[i+1])
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
