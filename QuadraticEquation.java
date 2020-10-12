import java.util.Scanner;

public class QuadraticEquation {
    public static void solution(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for 'a': ");
        double a = sc.nextDouble();

        System.out.println("Enter value for 'b': ");
        double b = sc.nextDouble();

        System.out.println("Enter value for 'c': ");
        double c = sc.nextDouble();

        double righthalf = (b*b) - (4*a*c);
        double squareroot = Math.sqrt(righthalf);
        if (righthalf>0){
            double firstvalue = (-b + squareroot) / (2 * a);
            double secondvalue = (-b - squareroot) / (2 * a);
            System.out.println("First Squareroot value is "+firstvalue);
            System.out.println("Second Squareroot value is "+secondvalue);
        }else if (righthalf == 0){
            System.out.println("SquareRoot is: "+(-b + squareroot)/(2 * a));
        }
    }
    public static void main(String[] args) {
       solution();
    }
}
