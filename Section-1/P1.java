// finding average of three numbers
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter First number :- ");
        a = sc.nextDouble();
        System.out.print("Enter Second number :- ");
        b = sc.nextDouble();
        System.out.print("Enter Third number :- ");
        c = sc.nextDouble();

        double avg = (a+b+c)/3;

        System.out.println("Average of "+a+" "+b+" and "+c+" is "+avg);

    }
}
