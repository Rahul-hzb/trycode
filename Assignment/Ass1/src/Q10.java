//Q 10 Write a method that returns the sum of all the elements in a specified column in a matrix
//using the following header:
//
//public static double sumColumn(double[][] m, int columnIndex)
//
//Write a java program that reads a 3-by-4 matrix and displays the sum of each column.

import java.util.*;
public class Q10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print(" entre the row M ");
        int M = sc.nextInt();
        System.out.print(" entre the collum N ");
        int N = sc.nextInt();
        // create matrix
        System.out.print(" entre " + M*N + " element ");
        int [][]array =new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                array[i][j]=sc.nextInt();
            }
        }
        // display in table:
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(" /t" + array[i][j] );
            }
        }
        System.out.println();


    }
}
