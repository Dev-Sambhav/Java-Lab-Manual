// finding two values of quadratic equation.
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter First Value :- ");
        a = sc.nextInt();
        System.out.print("Enter Second Value :- ");
        b = sc.nextInt();
        System.out.print("Enter Third Value :- ");
        c = sc.nextInt();

        int d = (b*b)-4*a*c;
        double x1 = (-b + Math.sqrt(d))/2*a;
        double x2 = (-b - Math.sqrt(d))/2*a;

        System.out.printf("First Root Value is %.2f\n",x1);
        System.out.printf("First Root Value is %.2f",x2);
    }
}