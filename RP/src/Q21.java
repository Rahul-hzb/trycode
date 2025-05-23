// creating user defined exception with java.
import java.util.Scanner;
class myExceptionIncorrectMatrixDimension extends Exception{
   public myExceptionIncorrectMatrixDimension( String myString){
       super(myString);
   }
}
class my2DMatrix{
    void Matrix( int a, int b)throws myExceptionIncorrectMatrixDimension{
        // initialize matrix to be processed
        int a_matrix[][]= {{1,2},{3,4}};
        System.out.println(" \nMatrix A is : ");
        for ( int i= 0; i<a;i++){
            for (int j=0;j<b; j++){
                System.out.print( a_matrix[i][j]);
            }
            System.out.printf("\n");
        }
        int r = 2;
        int c=2;
        if( c!= r){
            throw new myExceptionIncorrectMatrixDimension(" invalid matrix dimension for product ");

        }else {
            int b_matrix [][] = {{ 5,6},{ 7,8}};
            System.out.printf(" \nMatrix B is : ");
            for(int i=0;i<r;i++){
                for(int j =0;j<c;j++){
                    System.out.print( b_matrix[i][j]);
                }
                System.out.println();
            }
            int C[][]= new int[a][b];
            for( int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                    C[i][j]=0;
                    for(int k=0;k<r;k++){
                        C[i][j]+=a_matrix[i][k]*b_matrix[k][j];
                    }
                }
            }
            System.out.println(" \n\nMultiplication Matrix is .... \n\n ");
            for( int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    //Displays the final matrix having the product matrix
                    System.out.print(C[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }

}

public class Q21 {
    public static void main(String[] args) {
        my2DMatrix mat = new my2DMatrix();
        try{
            //test block for errors when it is executed.
            int row =2;
            int col =2;
            mat.Matrix(row, col);
        }
        catch (myExceptionIncorrectMatrixDimension e){
            System.out.println(" Exception handled for incorrect Matrix Dimention : ");
            System.out.println (e.getMessage());

        }
    }



    }

