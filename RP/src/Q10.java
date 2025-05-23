
// FIND ELEMENT IN THE ARRAY.
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Entre the value of n   ");
        int n = sc.nextInt();

        System.out.println(" Fill the element of array ");
        int [] arr=new int[n];
        for( int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( " entre the value of d ");
        int d = sc.nextInt();

        int ind = -1;
        for(int i=0;i<arr.length;i++){

            if( arr[i]==d){
                ind=i;
                break;

            }
        }
        System.out.println(  " index " + ind );

    }
}
