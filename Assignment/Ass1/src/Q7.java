//Write a java program to find the maximum and minimum and how many times they both occur
//in an array of n elements. Find out the positions where the maximum first occurs and the
//minimum last occurs.

import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println( " Entre the size of array " );
        int n= sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i< array.length;i++){
            array[i] = sc.nextInt();
        }
        int maxC=0;
        int maxInd=0;
        int max = array[0];
        for(int i=0;i< array.length;i++){
            if( array[i]> max){
                max=array[i];
                maxInd=i;
                maxC=1;
            }else if( array [i] ==max){
                maxC++;
            }

        }
        System.out.println( " max value  " + max + " index " + maxInd  + " occurce " + maxC);
           int minC =0 ;
        int minInd=0;
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if( array[i]<min){
                min=array[i];
                minInd =  i;
                minC=1;
            } else if ( array[i] ==min) {
                minC++;
                minInd=i;

            }
        }
        System.out.println( " Min value " + min + " index " + minInd  + " occurance " + minC);

    }
}
