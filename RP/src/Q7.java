 //  any base multiplication .
import java.util.Scanner;
public class Q7 {


    public static int getValueofAddition( int n1, int n2 ,int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv += d * p;
            p = p * 10;
        }

        return rv;
    }
     public static int getMullOfSingleDigit( int n1 , int b, int d2){
        int rv=0;
        int c=0;
        int p=1;
        while (n1 > 0 || d2 > 0  )  {
            int  d1= n1/10;
             n1 = n1/10;
             int d = d1*d2 + c;
             c= d/b;
             d=d%b;
             rv=  rv+ d*p;
             p = p*10;
        }


        return rv;
     }

     public static int getProduct( int n1,int n2 ,int b){
        int rv =0;
        int p = 1;
        while( n2>0){
            int d2 = n2%10;
            n2 = n2/10;
            int sprd =getMullOfSingleDigit( n1,b,d2);
            rv =  getValueofAddition( b,rv,sprd*p);
            p = p*10;

        }
        return rv;

     }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println( " entre the number n1,n2,and base b");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int b=sc.nextInt();
        int res=getValueofAddition(n1,n2,b);
        System.out.println( res);


    }
}
