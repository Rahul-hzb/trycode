// convert any base to the decimal
import java.util.Scanner;

public class Q3 {
    public static int anyBaseToDecimal( int b, int d){
        int rv=0;
        int p =1;
        while (b>0){
             int dig = b%10;
             b =b/10;
             rv +=dig*p;
             p=p*d;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Entre the no. , except base value 10");
        int b= sc.nextInt();
        System.out.println( " converting into decimal");
        int d = sc.nextInt();
        int res = anyBaseToDecimal(b,d);
        System.out.println( " new no. having base 10 " + res );

    }
}
