/*
3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both 
from left to right and from top to bottom.

w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	  
And print the start and ending index as

Start index : <1,2>
End index: <3, 2>
*/

import java.util.Scanner;

public class substringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        char arr[][] = new char[5][5];
        char a[] = str.toCharArray();
        int l = a.length;
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (k != l) {
                    arr[i][j] = a[k];
                    k++;
                } else {
                    break;
                }
            }
        }

        //print the string
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("Enter the string to search: ");
        String str1 = sc.next();
        char b[] = str1.toCharArray();
        int i, j, Horizontal = 0, Vertical = 0;
        boolean found = false;
        for (i = 0; i < 5; i++) {
            Horizontal = Vertical = 0;
            for (j = 0; j < 5 && Horizontal < b.length && Vertical < b.length; j++) {
                if (arr[i][j] == b[Horizontal]) {
                    Horizontal++;
                } else if (arr[j][i] == b[Vertical]) {
                    Vertical++;
                }
            }
            if (Horizontal == b.length) {
                found = true;
                System.out.println("Found horizontally starting at index " + "[" + i + "][" + (j - b.length) + "]");
                System.out.println("Found horizontally Ending at index " + "[" + i + "][" + (b.length) + "]");
            }
            if (Vertical == b.length) {
                found = true;
                System.out.println("Found vertically starting at index " + "[" + (j - b.length) + "][" + i + "]");
                System.out.println("Found horizontally Ending at index " + "[" + (b.length) + "][" + i + "]");
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
