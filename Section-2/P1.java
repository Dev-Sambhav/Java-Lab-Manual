// finding area of triangle by heroes formulae.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double a,b,c;
        System.out.print("Enter First Side :- ");
        a = sc.nextDouble();
        System.out.print("Enter Second Side :- ");
        b = sc.nextDouble();
        System.out.print("Enter Third Side :- ");
        c = sc.nextDouble();

        double s = (a+b+c)/2.0d;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("Area :- %.2f",area);
    }
}