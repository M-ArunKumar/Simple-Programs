import java.util.Arrays;
import java.util.List;

public class StringSegmentation {

    public static void wordBreak(List<String> dict, String str, String out)
    {
        for (int i = 1; i <= str.length(); i++)
        {
            String prefix = str.substring(0, i);

            if (dict.contains(prefix)) {
                wordBreak(dict, str.substring(i), out + " " + prefix);
            }
        }

        if (str.length() == 0)
        {
            System.out.println(out);
            return;
        }

    }

    public static void main(String[] args)
    {

        List<String> dict = Arrays.asList( "i", "like", "sam", "sung", "samsung", "mobile", "ice",
                "cream", "icecream", "man", "go", "mango");

        String str = "ilike";

        wordBreak(dict, str,"");
    }
}
