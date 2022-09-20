// finding number is divisible by 7 or not.
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Enter a number:- ");
       n = sc.nextInt();
       if(n%7==0) System.out.println(n + " is divisible by 7");
       else System.out.println(n + " is not divisible by 7");
    }
}