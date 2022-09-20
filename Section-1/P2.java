// finding simple interest and compound interest
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int p,r,t;
       System.out.print("Enter Principal :- ");
       p = sc.nextInt();
       System.out.print("Enter Rate :- ");
       r = sc.nextInt();
       System.out.print("Enter Time :- ");
       t = sc.nextInt();
    
       double si = (double)(p*r*t)/100;
       double ci = (double)(p*(Math.pow((1+r/100),t)));

       System.out.println("SI :- "+si);
       System.out.println("CI :- "+ci);

    }
}