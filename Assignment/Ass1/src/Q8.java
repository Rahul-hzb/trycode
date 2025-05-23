//Write a java program to print M-by-N array in the tabular format. Also, display the sum of
//elements of the array.

import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Entre the value of row M ");
         int m = sc.nextInt();
         System.out.println( " Entre the value of column N");
         int n = sc.nextInt();

          int [][] array= new int[m][n];
          int sum = 0 ;

          // put the value of array;
            System.out.print( " Entre " + m*n + " Element ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = sc.nextInt();
                    sum = sum + array[i][j];//  Add element to the sum .
                }
            }
        // Display in table formate .

        System.out.println( "The " + m + " -by-" +  n  + " Matrix ");
        for (int i =0;i<m;i++){
            for( int j=0;j<n;j++){
                System.out.print(  "\t" +array[i][j] );
            }
            System.out.println();
        }
        System.out.println( " \n sum of all element " + sum);

    }
}
