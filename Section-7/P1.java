//  printing all natural number from 1 to 500 which is divisible by 9.
public class P1 {
    public static void main(String[] args){
       for(int i=1; i<=500; i++){
            if(i%9==0) System.out.print(i+" ");
       }
    }
}