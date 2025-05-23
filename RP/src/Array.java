//Declaration of array , assignment of array , put value of array;

public class Array {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks[0] = 34;
        marks[1] =56;
        marks[2] =98;
        marks[3] =45;
        marks[4] =67;
        System.out.println( marks.length);
        for( int i =0 ; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
            String name[] = {   " rahul " , " manish " , " suruti " , " anisha " , " harsh" };
            System.out.println( name.length);
            for ( int i =0; i< name.length; i++){
                System.out.println( name[i]  + " " +   marks[i] );
            }
            System.out.println();
        }

    }

