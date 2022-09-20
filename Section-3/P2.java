//  swapping two numbers using third variable.
import java.util.Scanner;
public class P2 {
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
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:- ");
        System.out.println("A :- "+a);
        System.out.println("B :- "+b);

    }
}