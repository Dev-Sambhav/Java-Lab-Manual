// find out Electricity Bill by inputting previous meter reading and 
// current meter reading as per given criteria
// a. If total unit <=100 then charge will be 3.5/Unit
// b. If total unit>100 and <=200 then charge will be 4/Unit
// c. If total unit>200 and <=300 then charge will be 4.5/Unit
// d. If total unit>300 then charge will be 5/Unit
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int pr,cr;
       System.out.print("Enter Current Reading:- ");
       cr = sc.nextInt();
       System.out.print("Enter Previous Reading:- ");
       pr = sc.nextInt();

       if(pr > cr){
        System.out.println("Wrong Info !!!");
        System.exit(0);
       }

       double tr = cr-pr;

       if(tr<=100) tr = tr*3.5;
       else if(tr <= 200) tr = (100*3.5)+(tr-100)*4;
       else if(tr <= 300) tr = (100*3.5)+(100*4)+(tr-200)*4.5;
       else if(tr > 300) tr = (100*3.5)+(100*4)+(100*4.5)+(tr-300)*5;

       System.out.println("Total Bill is "+tr);

    }
}