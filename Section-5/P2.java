//  finding minimum number among given three numbers.
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a,b,c;
        System.out.print("Enter First number :- ");
        a = sc.nextInt();
        System.out.print("Enter Second number :- ");
        b = sc.nextInt();
        System.out.print("Enter Third number :- ");
        c = sc.nextInt();

        int min = Integer.MAX_VALUE;
        if(a<b){
            if(a<c) min = a;
            else min = c;
        }else{
            if(b<c) min = b;
            else min = c;
        }

        System.out.println("Minimum number is "+min);
    }
}