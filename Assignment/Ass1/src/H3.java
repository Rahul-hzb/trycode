// H3 Write a Java program that takes two arrays a and b of length n storing int values, and returns
//the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
//for i = 0, . . . , n − 1.
import java.util.Scanner;
public class H3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" entre the size array ");
        int n = sc.nextInt();
        System.out.println(" entre the value  of array a ");

        int[] a = new int[n];
        System.out.println(" entre the value of array b ");
        int[] b = new int[n];

        // entre the value of array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // entre the value of array b
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int res = calculateTheDotProduct(  a,b);
        System.out.println(res );

    }

    public static int calculateTheDotProduct(int[] a, int[] b) {
        int n = a.length;
        int dotproduct=0;
        for (int i = 0; i < n; i++) {
            dotproduct += a[i] * b[i];
        }
        return dotproduct;

        }


    }



