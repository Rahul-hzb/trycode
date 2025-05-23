 // convert the decimal no. into any base no.
import java.util.Scanner;
public class Q2 {
     public static int getValueIntobase( int n, int b){
         int rv=0;
         int p =1;
         while(n>0){

             int dig= n%b;
             n= n/b;
             rv += dig*p;
             p = p*10;
         }
         return rv;
     }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println( " Entre the number having base 10 ");
         int n = sc.nextInt();
         System.out.println( " converting base " );
         int b = sc.nextInt();
         int rs = getValueIntobase(n,b);
         System.out.println( " New no. having base  b "  +  rs );

    }
}
