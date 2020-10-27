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
