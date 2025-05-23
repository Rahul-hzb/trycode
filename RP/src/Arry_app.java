// Application of array.
// application of array
//1 . performance
//2 . assign
//3. function

public class Arry_app {
    public static int Swap(int[] arry, int i, int j) {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
        return temp;
    }

    public static void main(String[] args) {
        int[] arry ;
        arry = new int[5];
        arry[0]=7;
        arry[1]= 8;
        arry[2] = 10;
        arry[3]= 90;   //performance
        arry[4]= 100;
                // time taken to assign the value not depend on the length
                // becouse they have specific address.

                // .2  assign
                int []two=arry;
                two[2] =80;

                 Swap( arry , 0, 2);
                for( int i = 0; i< arry.length;i++){
                    System.out.println( arry[i]);
                }
            }
}



