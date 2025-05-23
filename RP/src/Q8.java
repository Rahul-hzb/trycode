// Q . difference between maximum and minimun value of array;
// you are given number n , n represent no. of element in array;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( " Entre the value of n ");
        int n = sc.nextInt();
        System.out.println( " fill the  array  accoding to no. of n value");

        int [] arr= new int[n];
        for( int i =0; i < arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for( int i=0; i<arr.length;i++){
            if( arr[i]>max){
                max=arr[i];
            }
            if( arr[i]<min){
                min=arr[i];
            }
        }
        int spam = max- min;
        System.out.println(  " Spam number =  " +  spam);


    }
}
