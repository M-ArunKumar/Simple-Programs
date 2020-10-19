/*
6. Using Recursion reverse the string such as

Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I 
*/

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String original = sc.nextLine();
        sc.close();

        String words[] = original.split(" ");
        String reversed = "";

        for (int i=0;i<words.length;i++){
            if (i == words.length-1){
                reversed = words[i] + reversed;
            }else reversed = " " + words[i] + reversed;
        }

        System.out.println("Reversed string: "+reversed);
    }
}
