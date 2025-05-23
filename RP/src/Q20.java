// using multiple catch block
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        int []a= { 5,10};
        int b =5;
        try {
            int x= a[2]/b-a[1];
        } catch ( ArithmeticException e) {
            System.out.println( " Division by zero ");
        }
        catch ( IndexOutOfBoundsException e){
            System.out.println(" array index error ");
        }
        catch (ArrayStoreException e){
            System.out.println( "  Wrong data type ");
        }
        finally {
            int y = a[1]/a[0];
            System.out.println(" y" + y);
        }

    }
}
// whose parameter matched to the exception object will be executed and remaining Statement will be skipped:
// finally this is guaranteed to execute regardless of whether or not an exception is thrown: