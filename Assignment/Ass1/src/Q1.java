//Write a Java program that can take a positive integer greater than 2 as input and write out the
//number of times one must repeatedly divide this number by 2 before getting a value less
//than 2.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println(" enter a number greater then 2 ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 2) {
            System.out.println(" invalid input ");
        } else {
            int count = 0;
            while (num >= 2) {
                num /= 2;
                if (num >= 2) {
                    count++;
                }
            }
            System.out.println(" number of division " + count);
        }
        System.out.println();

    }
}
