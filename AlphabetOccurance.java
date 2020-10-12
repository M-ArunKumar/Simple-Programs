import java.util.Scanner;

public class AlphabetOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        String str = sc.next();

        for(int j=0; j<str.length(); j++)
        {
            char a = str.charAt(j);
            int b = ((int)str.charAt(++j)-48);
            //  System.out.println(a);

                if(j+1 >= str.length())
            {
                for(int i=0; i<b; i++)
                    System.out.print(a);
                break;
            }

            if (((int)str.charAt(j+1)-48)>-1 && ((int)str.charAt(j+1)-48)<10)
            {
                b = (b*10) + ((int)str.charAt(++j)-48);
            }
            //System.out.println(b);
            for(int i=0; i<b; i++)
                System.out.print(a);
        }
    }
}
