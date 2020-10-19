/*
1. Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 

*/
import java.util.Scanner;

public class crossXpattern {
    static void xPattern(String str, int len){
        // i and j are the indexes
        // of characters to be
        // displayed in the ith
        // iteration i = 0 initially
        // and go upto length of string
        // j = length of string initially
        // in each iteration of i,
        // we increment i and decrement j,
        // we print character only
        // of k==i or k==j

        for (int i = 0; i < len; i++)
        {
            int j = len - 1 - i;
            for (int k = 0; k < len; k++)
            {
                if (k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        int len = str.length();
        xPattern(str,len);
    }
}
