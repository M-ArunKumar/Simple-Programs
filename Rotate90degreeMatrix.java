public class Rotate90degreeMatrix {
        static void rotate90Clockwise(int a[][])
        {
            int N = a.length;

            for (int i = 0;i< N;i++){
                for (int j = 0;j<i;j++){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N / 2; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[i][N - 1 - j];
                    a[i][N - 1 - j] = temp;
                }
            }
        }

        public static void main (String[] args)
        {
            int arr[][] = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
            int N = arr.length;
            rotate90Clockwise(arr);

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                    System.out.print( arr[i][j] + " ");
                System.out.println();
            }
        }
}
