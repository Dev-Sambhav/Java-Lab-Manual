// Take input month number and year find out total numbers of days in 
// that month using switch........ case..........
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int m,y;
       System.out.print("Enter Month Number:- ");
       m = sc.nextInt();
       System.out.print("Enter Year:- ");
       y = sc.nextInt();

       switch(m){
            case 1:
                System.out.println("Total Numbers of days in January is 31");
                break;
            case 2:
                if(IsLeapYear(y)){
                    System.out.println("Total Numbers of days in February is 29");
                }else System.out.println("Total Numbers of days in February is 28");
                break;
            case 3:
                System.out.println("Total Numbers of days in March is 31");
                break;
            case 4:
                System.out.println("Total Numbers of days in April is 30");
                break;
            case 5:
                System.out.println("Total Numbers of days in May is 31");
                break;
            case 6:
                System.out.println("Total Numbers of days in June is 30");
                break;
            case 7:
                System.out.println("Total Numbers of days in July is 31");
                break;
            case 8:
                System.out.println("Total Numbers of days in August is 31");
                break;
            case 9:
                System.out.println("Total Numbers of days in September is 30");
                break;
            case 10:
                System.out.println("Total Numbers of days in October is 31");
                break;
            case 11:
                System.out.println("Total Numbers of days in November is 30");
                break;
            case 12:
                System.out.println("Total Numbers of days in December is 31");
                break;
            default:
                System.out.println("Wrong Input!!!");
       }

    }

    static boolean IsLeapYear(int year){
        if(year%100==0){
            if(year%400==0) return true;
            else return false;
        }else{
            if(year%4==0) return true;
            else return false;
        }
    }
}