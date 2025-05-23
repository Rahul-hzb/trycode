import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" entre the value of n ");
        int n = sc.nextByte();
        System.out.println(" entre the value of r ");
        int r = sc.nextInt();
        if (n < r) {
            System.out.println(" invalaid input ");
        } else {
            int nfact =1;
            for(int i = 1;i<=n;i++){
                nfact *= i;
            }
            int nmrfact=1;
            for( int i=1;i<= n-r; i++){
                nmrfact*=i;
            }
            System.out.println( nfact/nmrfact);


        }
        System.out.println();

    }
}