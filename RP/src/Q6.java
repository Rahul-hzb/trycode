// any base substraction.
import java.util.Scanner;
public class Q6 {
    public static int getValueofsub ( int n1, int n2 ,int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = 0;
            d2 = d2 + c;
            if (d2 >= d1) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + b - d1;
            }
            rv += d * p;
            p = p * 10;
        }
        return rv;
    }
    public static void main(String[] args) {
                Scanner sc=new Scanner( System.in);
                System.out.println( " entre the number n1,n2,and base b");
                int n1= sc.nextInt();
                int n2 = sc.nextInt();
                int b=sc.nextInt();
                int res=getValueofsub(n1,n2,b);
                System.out.println( res);
            }

    }

