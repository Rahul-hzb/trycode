//Q6. Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
//method can't use the multiplication, modulus, or division operators, The method signature is
//as follows.

import java.util.Scanner;
public class Q5 {
    public static boolean numisodd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(numisodd(n));
    }
}