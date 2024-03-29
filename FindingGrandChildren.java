/* 

5. Given a two dimensional array of string like

  <”luke”, “shaw”>
  <”wayne”, “rooney”>
  <”rooney”, “ronaldo”>
  <”shaw”, “rooney”> 
Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. 
So our output should be 2.

*/

import java.util.Scanner;

public class FindingGrandChildren {
    public static void main(String[] args) {
        String names[][] = {{"luke","wayne"},
                            {"wayne","rooney"},
                            {"rooney","ronaldo"},
                            {"shaw","rooney"}};
        String childRonaldo = "";
        int count = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name");
        String str = in.nextLine();

        for (int i=0;i<names.length;i++)
        {
            if (names[i][1].equals(str))
            {
                childRonaldo = names[i][0];
                System.out.println("Child of " + str + " : " + childRonaldo);
                break;
            }
        }
        for (int k=0;k<names.length;k++)
        {
            if (names[k][1]== childRonaldo)
            {
                count++;
            }
        }
        System.out.println("No: of Grand children " + str + " : " + count);
    }
}
