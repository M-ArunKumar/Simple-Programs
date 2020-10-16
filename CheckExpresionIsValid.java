import java.util.Scanner;
import java.util.Stack;

public class CheckExpresionIsValid {

    public static Boolean balancedParenthensies(String expression) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Expression: ");
        String expression = in.nextLine();
        boolean answer = balancedParenthensies(expression);
        if (answer) {
            System.out.println("Valid");
        }
        else System.out.println("InValid");
    }

}
