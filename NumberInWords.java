import java.util.Scanner;

public class NumberInWords {

        static String one[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen " };

        static String ten[] = { "", "", "twenty ", "thirty ", "forty ","fifty ", "sixty ", "seventy ", "eighty ","ninety " };

        static String numToWords(int number, String s)
        {
            String str = "";
            if (number > 19) {
                str += ten[number / 10] + one[number % 10];
            }
            else str += one[number];

            if (number != 0) {
                str += s;
            }
            return str;
        }

        static String convertToWords(long number)
        {
            String out = "";
            out += numToWords((int)((number / 1000) % 100), "thousand ");
            out += numToWords((int)((number / 100) % 10), "hundred ");
            if (number > 100 && number % 100 > 0) {
                out += "and ";
            }
            out += numToWords((int)(number % 100), "");
            return out;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to convert: ");
            long number = sc.nextInt();
            System.out.print(convertToWords(number));
        }


}
