 //  Q5.  Write a java method to calculate the sum of digits of a given number until the number is a
  //     single digit. The method signature is as follows.

import java.util.Scanner;
public class Q4 {
    public static int sumofdigit(int n) {
        int sum = 0;
        while (n >= 10) {
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
        }
        return sum;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println(" entre the value n ");
            int n = sc.nextInt();
            int r = sumofdigit(n);
            System.out.println(r);

        }
    }
