//introducing function;
import java.util.Scanner;
public class Function_1 {
    public static int fact( int n){
        int fact= 1;
        for( int i =1;i<=n; i++){
            fact *= i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println( " entre the value of n ");
        int n = sc.nextInt();
        System.out.println( " entre the valur of r ");
        int r =sc.nextInt();
        int nfact= fact(n);
        int nmrfact =fact(n-r);
        int npr = nfact/nmrfact;
        System.out.println( " npr = "  + npr);


    }
}
