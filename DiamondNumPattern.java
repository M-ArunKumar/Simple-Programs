public class DiamondNumPattern {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }

            num = (i*(i+1))/2;
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }

        for (int i = n-1; i > 0; i--) {
            num = (i*(i+1))/2;
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();

            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }

        }
    }
}
