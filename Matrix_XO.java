/*

1) Print the given pattern:
Input:
N= 3, M=3
Output:
X X X
X 0 X
X X X

Input:
N=4 M=5
Output:
X X X X
X 0 0 X
X 0 0 X
X 0 0 X
X X X X

*/

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int row = sc.nextInt();

        System.out.println("Enter the column: ");
        int col = sc.nextInt();

        char[][] matrix = new char[row][col];
        int firstRow = 0;
        int lastRow = row-1;
        int firstCol = 0;
        int lastCol = col-1;
        
        
        char c;
        while (true){
            if (firstRow % 2 == 0)
                c = 'X';
            else
                c = 'O';
            
        //print first row---------------------
            for (int i = firstCol; i <= lastCol ; ++i) {
                matrix[firstRow][i] = c;
            }
            firstRow++;

            if (firstRow>lastRow || firstCol>lastCol)
                break;

            
        //print last column---------------------
            for (int i = firstRow; i <= lastRow ; ++i) {
                matrix[i][lastCol] = c;
            }
            lastCol--;

            if (firstRow>lastRow || firstCol>lastCol)
                break;

            
         //print last row---------------------
            for (int i = lastCol; i >= firstCol ; --i) {
                matrix[lastRow][i] = c;
            }
            lastRow--;

            if (firstRow>lastRow || firstCol>lastCol)
                break;


         //print first column---------------------
            for (int i = lastRow; i >= firstRow ; --i) {
                matrix[i][firstCol] = c;
            }
            firstCol++;

            if (firstRow>lastRow || firstCol>lastCol)
                break;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}
