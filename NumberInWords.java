import java.util.Scanner;

public class NumberInWords {
    public static void main(String args[])
    {
        String[] one = {"","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String[] two = {"Twenty","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","eighteen","nineteen"};
        String[] three = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        if(number == 0)
            System.out.println("ZERO");

        else if(number < 11)
            System.out.println(one[number]);

        else if(number > 10 && number < 21)
            System.out.println(two[number%10]);

        else if(number > 20 && number < 1000)
        {
            int temp = number;
            int count = 0;

            while(temp != 0)
            {
                count++;
                temp = temp / 10;
            }

            if(count == 2)
            {
                System.out.print(three[number/10]+" ");
                System.out.println(one[number%10]);
            }
            else if(count == 3)
            {
                System.out.print(one[number/100]+" hundred and ");
                number = number - ((number/100)*100);
                System.out.print(three[number/10]+" ");
                System.out.println(one[number%10]);
            }
        }
    }
}
