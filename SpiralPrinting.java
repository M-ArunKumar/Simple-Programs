public class SpiralPrinting {
    static void pattern(int value)
    {
        int row = 2 * value - 1;
        int column = 2 * value - 1;
        int[][] arr = new int[row][column];

        int i, j, k;

        for (k = 0; k < value; k++) {

            //print first row
            j = k;
            while (j < column - k) {
                arr[k][j] = value - k;
                j++;
            }


            //print last column
            i = k + 1;
            while (i < row - k) {
                arr[i][row - 1 - k] = value - k;
                i++;
            }


            //print last row
            j = column - k - 2;
            while (j >= k) {
                arr[column - k - 1][j] = value - k;
                j--;
            }


            //print first column
            i = row - k - 2;
            while (i > k) {
                arr[i][k] = value - k;
                i--;
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = 4;
        pattern(n);
    }
}

