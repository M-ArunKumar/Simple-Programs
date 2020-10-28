/*

3) Form a number system with only 3 and 4. Find the nth number of the number system.
Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 .....

*/

import java.util.ArrayList;

public class NumberSystem {
    public static void main(String[] args) {
        printCombinations(20);
    }
    public static void printCombinations(int n){
        ArrayList<String> numbers = new ArrayList<String> ();

        numbers.add("3");
        numbers.add("4");
        int currentNumber = 0;

        while(numbers.size()<n){
            ArrayList<String> threePrefixed = new ArrayList<String>();
            ArrayList<String> fourPrefixed = new ArrayList<String>();

            for(int i=currentNumber;i<numbers.size();i++){
                threePrefixed.add("3"+numbers.get(i));
                fourPrefixed.add("4"+numbers.get(i));
                currentNumber++;
            }

            for(String s:threePrefixed){
                numbers.add(s);
            }

            for(String s:fourPrefixed){
                numbers.add(s);
            }
        }

        System.out.println("Printing result");
        for(String s:numbers){
            System.out.print(" "+s);
        }

    }
}
