//  finding GCD (Greatest Common Divisor) of the given two numbers.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a,b;
       System.out.print("Enter First number:- ");
       a = sc.nextInt();
       System.out.print("Enter Second number:- ");
       b = sc.nextInt();

       int min = a;
       if(min<b) min = b;

       while(a%min != 0 || b%min != 0){
            min--;
       }
       System.out.println("GCD of "+a+" and "+b+" is "+min);
    }
}