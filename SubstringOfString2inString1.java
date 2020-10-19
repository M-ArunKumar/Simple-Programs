/*

4. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
        
*/

import java.util.Scanner;

public class SubstringOfString2inString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.next();

        System.out.println("Enter String 2 : ");
        String str2 = sc.next();

        int signal = 1;
        for (int i=0;i<=(str1.length())-(str2.length());i++){

            int flag = 1;

            for (int j = 0;i < str1.length() && j<str2.length();j++,i++){
                if (str2.charAt(j) != str1.charAt(i)){
                    flag = 0;
                    break;
                }
            }

            if (flag == 1){
                signal = 0;
                System.out.print(i - str2.length());
            }
        }
        if (signal == 1){
            System.out.print(-1);
        }
    }
}
