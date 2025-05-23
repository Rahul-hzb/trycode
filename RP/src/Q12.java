// Sum of two array.
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Entre the size of array");
        int n1 = sc.nextInt();
        int [] a1= new int[n1];
        for(int i=0;i<a1.length;i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println( " entre the 2nd array size ");

            int n2 = sc.nextInt();
            int []a2= new int[n2];
            for( int i=0; i<a2.length;i++){
                a2[i]= sc.nextInt();
        }
            int sum[] = new int[  n1>n2? n1: n2]; //terrnary 0perater;
         int c=0;
         int i= a1.length-1;
         int j= a2.length-1;
         int k= sum.length-1;

         while( k>=0){
             int d =c;
             if( i>=0){
                 d+=a1[i];
             }
             if(j>=0){
                 d+=a2[i];
             }
             c= d/10;
             d=d%10;
             sum[k]=d;
             i--;
             j--;
             k--;

         }
         if( c!=0){
             System.out.println( c);
         }
         for( int val:sum){
             System.out.println( val);
         }

    }
}
