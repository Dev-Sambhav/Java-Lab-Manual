//  swapping two numbers without using third variable.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a,b;
        System.out.print("Enter First number :- ");
        a = sc.nextInt();
        System.out.print("Enter Second number :- ");
        b = sc.nextInt();

        System.out.println("Before Swapping:- ");
        System.out.println("A :- "+a);
        System.out.println("B :- "+b);

        // processing
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:- ");
        System.out.println("A :- "+a);
        System.out.println("B :- "+b);

    }
}