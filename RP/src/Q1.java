//digit frequency in array;
import java.util.Scanner;
public class Q1 {
    public static int getDigitFrequency( int n, int d){
        int count =0;
        while (n>0){
            int dig = n%10;
            n= n/10;
            if( dig==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( " Entre the number ");
        int n = sc.nextInt();
        System.out.println( " Entre the frequency digit  ");
        int d= sc.nextInt();
        int f = getDigitFrequency(n,d);
        System.out.println(f);

    }
}
