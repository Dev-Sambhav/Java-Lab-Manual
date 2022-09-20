//  maximum number among three numbers using Ternary Operator (Conditional operator).
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter First number :- ");
        a = sc.nextInt();
        System.out.print("Enter Second number :- ");
        b = sc.nextInt();
        System.out.print("Enter Third number :- ");
        c = sc.nextInt();

        int max = (a>b) ? (a>c) ? a : c : (b>c) ? b : c;

        System.out.println("Maximum number is "+max);
    }
}