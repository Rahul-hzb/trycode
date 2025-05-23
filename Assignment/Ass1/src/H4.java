import java.util.Scanner;
public class H4 {

    public static int[][] sumOfMatrix(int[][]array_1, int[][]array_2){
        int row = array_1.length;
        int col = array_1[0].length;
        if (row != array_2.length || col != array_2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }
        int res[][] =new int[row][col];
        for ( int i=0; i<0;i++){
            for ( int j=0;j<0;j++){
                res[i][j]=array_1[i][j]+array_2[i][j];
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println( " Put the value of row M ");
        int M = sc.nextInt();
        System.out.println( " Put the value of columns N ");
        int N = sc.nextInt();

        System.out.println( " matrix 1 " + M*N );
        int array_1[][]=new int[M][N];
        for(int i=0;i<M;i++){
            for( int j=0;j<N;j++){
                array_1[i][j] =sc.nextInt();
            }
        }
        // dispaly arraay1 in table form
        for(int i=0;i<M ;i++){
            for( int j=0; j<N;j++){
                System.out.print(   " \t " + array_1[i][j]);

            }
        }
        System.out.println();




        System.out.println( " matrix2 "  + M*N );
        int array_2[][]= new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0; j<N; j++){
               array_2[i][j]=sc.nextInt();
            }
        }

        for( int i=0; i<M ; i++){
            for( int j=0;j<N;j++){
                System.out.print( "\t"  + array_2[i][j] );
            }
        }
        System.out.println();

        int[][] result= sumOfMatrix(array_1,array_2);
        System.out.println( result);
    }
}
