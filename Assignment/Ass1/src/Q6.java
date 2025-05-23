
//Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
//method can't use the multiplication, modulus, or division operators, The method signature is
//as follows.


import java.util.*;
public class Q6 {
    public static boolean isOdd( int n ){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " entre the number ");
        int n = sc.nextInt();
        System.out.println(   " Number is odd " + isOdd(n)  + " ");

    }
}
