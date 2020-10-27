/*

1. Write a program to give the following output for the given input
Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.

*/


import java.util.Scanner;

public class AlphabetOccurance {
    static void solution(String str){
        char[] ch = str.toCharArray();
        int count = 0;
        String store = "";

        for (int i = 0; i < ch.length;) {
            if (Character.isAlphabetic(ch[i])){
                store = ch[i]+"";
                i++;
            }else {
                while (i < ch.length && Character.isDigit(ch[i])){
                    count = 10*count + Integer.parseInt(ch[i]+"");
                    i++;
                }
                for (int j = 0; j < count; j++) {
                    System.out.print(store);
                }
                count = 0;
                store = "";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        String str = sc.next();
        solution(str);
    }
}
