import java.util.Scanner;
public class Q11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " entre n1");
        int n1 = sc.nextInt();
        int arr1[]=array(sc,n1);

        System.out.println(" entre n2 ");
        int n2 = sc.nextInt();
        int arr2[] = array( sc,n2);

    }
    public static int[] array(  Scanner sc, int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
     }
  }
