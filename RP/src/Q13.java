// Difference of two array
// Assumption array a2> a1;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Put size a array a1");
        int n1 = sc.nextInt();
        int a1[]= new int[n1];
        for( int i=0; i<a1.length;i++){
            a1[i]= sc.nextInt();
        }

        int n2 = sc.nextInt();
        int a2[] =new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]= sc.nextInt();
        }

        int diff[]= new int[n2>n1 ?n2:n1];
        int c=0;
        int i= a1.length-1;
        int j= a2.length-1;
        int k= diff.length-1;

        while ( k>=0){
            int d =0;
            int a1v= i>=0?a1[i]:0;  // some time a1 have smale no.off digit;
            if( a2[j] + c >= a1v){
                d= a2[j] + c-a1v;
                c=0;

            }else{
                d=a2[j]+c+10-a1v;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int ind =0;
        while( ind<diff.length){
            if(diff[ind]==0){
                ind++;
            } else {
                break;
            }
        }
        while( ind<diff.length){
            System.out.print( diff[ind]);
            ind++;
        }


    }
}
