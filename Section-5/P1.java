//  finding a year is Leap year or Not.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int year;
       System.out.print("Enter a Year:- ");
       year = sc.nextInt();

       if(year%100==0){
            if(year%400==0) System.out.println("Leap year");
            else System.out.println("Not a leap year");
       }else{
            if(year%4==0) System.out.println("Leap year");
            else System.out.println("Not a leap year");
       }
    }
}