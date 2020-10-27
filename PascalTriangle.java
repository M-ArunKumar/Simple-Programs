public class PascalTriangle {
    public static void main (String[] args) {
        int n = 7;
        printPascal(n);
    }

    public static void printPascal(int n)
    {
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++)
            {
                if (i == j || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
