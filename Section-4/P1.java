// finding number is even or odd.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Enter a number:- ");
       n = sc.nextInt();
       if(n%2==0) System.out.println("Even Number");
       else System.out.println("Odd Number");
    }
}