// nested exception
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        try {
            int a = 2, b = 4, c = 2, x = 7, z;
            int[] p = {2};
            p[3] = 33;
            try {
                z = x / ((b * b) - (4 * a * c));
                System.out.println(" the value of Z is  =" + z);
            } catch (ArithmeticException e) {
                System.out.println(" Division by zero in Arithmetic expression ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  ArrayIndexOutOfBoundsException e ");
        }
    }
}
