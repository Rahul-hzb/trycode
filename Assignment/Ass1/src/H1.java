//Write a Java program that takes as input three integers, a, b, and c, from the Java console
//and determines if they can be used in a correct arithmetic formula (in the given order), like
//“a + b = c,” “a = b − c,” or “a b = c.”∗
import java.util.*;
public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " entre the value of of a ");
        int a = sc.nextInt();
        System.out.println( " entre the value of  b ");
        int b = sc.nextInt();
        System.out.println( " entre the value of c  ");
        int c = sc.nextInt();

        if( a+b==c){
            System.out.println(" valid formula ");
        } else if ( a==b-c) {
            System.out.println( " valid formula ");

        }else if( a*b==c){
            System.out.println(" valid formula ");
        }else {
            System.out.println(" invlid formula");
        }

    }
}
