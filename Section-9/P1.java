//  finding Table of the given number.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Enter a number:- ");
       n = sc.nextInt();
       for(int i=1; i<=10; i++){
          System.out.println(n+" * "+i+" = "+(n*i));
       }
    }
}