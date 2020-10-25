/*
Given a string, reverse only vowels in it; leaving rest of the string as it is.

Input : abcdef
Output : ebcdaf

*/

import java.util.Scanner;

public class ReverseOnlyVowels {
    
    static boolean isVowel(char c){
        return (c == 'a' || c == 'A'||
                c == 'e' || c == 'E'||
                c == 'i' || c == 'I'||
                c == 'o' || c == 'O'||
                c == 'u' || c == 'U');
    }

    static String solution(String words){
        int i = 0;
        int j = words.length()-1;
        char[] answer = words.toCharArray();
        while (i < j){
            if (!isVowel(answer[i])){
                i++;
                continue;
            }
            if (!isVowel(answer[j])){
                j--;
                continue;
            }

            char temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;

            i++;j--;
        }
        String result = String.copyValueOf(answer);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String words = sc.next();
        System.out.println(solution(words));
    }
}
