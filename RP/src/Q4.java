// no. converted into any base to any base
import java.util.Scanner;

public class Q4 {
    public static int getIntoDecimal( int n , int b){
        int rv=0;
        int p=1;
         while (n>0){
             int dig = n%10;
             n= n/10;
             rv += dig*p;
             p = p*b;
         }
        return rv;
    }
    public static int getDecimalToAny( int n ,int b){
        int rv=0;
        int p=1;
        while( n>0){
            int dig = n%b;
            n=n/b;
            rv += dig*p;
            p=p*10;
        }
        return rv;
    }
    public static int getValue( int n,int b1,int b2){
        int dec = getIntoDecimal(n,b1);
        int det = getDecimalToAny(dec,b2);
        return det;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println( " entre the number ");
        int n = sc.nextInt();
       // System.out.println( " entre the base ");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int newNo = getValue( n,b1,b2);
        System.out.println( newNo);



    }

}
