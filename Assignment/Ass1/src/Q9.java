// Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
//values using the following header:
//
//public static double sumMajorDiagonal(double[][] m)
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Put the value of row M ");
        int M = sc.nextInt();
        System.out.println( " Put the value of columns N ");
        int N = sc.nextInt();

        // create array.
        int digsum = 0;
        System.out.println( " Entre "+ M*N + " element ");
        int [][]array = new int[M][N];
        for(int i=0;i<M ;i++){
            for ( int j=0;j<N;j++){
                array[i][j]=sc.nextInt();
                if( array[i][j]==array[i][i]){
                    digsum+=array[i][i];
                }
            }
        }
        // display in table formate
        for ( int i =0;i<M;i++){
            for( int j=0;j<N ; j++){
                System.out.print( " Matrix a " + "\t"+ array[i][j]);
            }
            System.out.println();
        }
        System.out.println( " Sum of diagonal " + digsum);

    }
}
