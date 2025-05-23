// Q3.  Write a java program to check whether a number is a spy number or not.

import java.util.Scanner;
public class Q3 {
    public static int sumofdigit( int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumofdigit(n/10);

    }
    public static int productofdigit(int n){
        if(n==0){
            return 1;
        }
        return (n%10 == 0 ? 1 : n%10)* productofdigit(n/10);
    }
    public static void main(String[] args) {
        int n=231;
        int result1 =sumofdigit(n);
        System.out.println( result1);
        int result2=productofdigit(n);
        System.out.println( result2);
        if( result1== result2){
            System.out.println( "  number " + n + " is  spy number "  );
        }

    }
}
