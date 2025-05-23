public class CLarg {
    public static void main(String[] args) {
        int invalid =0;  // Number of invalid arguments
        int number ;
        int count =0;
        for( int i=0;i< args.length;i++){
            try {
                number=Integer.parseInt(args[i]);
            }
            catch( NumberFormatException e){
                invalid= invalid+1;  // caught an invalid number
                System.out.println( " Invalid number : " + args[i]);
                continue;    // Skip the remaining part of the  loop
            }
            count = count+1;
        }
        System.out.println(" valid number = " + count);
        System.out.println(" invalid number = " + invalid);
    }
}
