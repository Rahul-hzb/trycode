// Required to print true if you detech extra bracket and false otherwise.
/*import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack< Character> st = new Stack<>();
        for( int i =0; i< str.length();i++){
            char ch = str.charAt(i);
            if( ch== '(' || ch=='[' || ch=='{'){
             st.push(ch);
            } else if ( ch==')') {
                boolean val = handleClosing(st ,'(');
             if( val==false){
                 System.out.println( val);
                 return;
             }
            }else if( ch==']'){
               boolean val = handleClosing(st ,'[');
                if( val==false){
                    System.out.println( val);
                    return;


            }else if( ch=='}'){
                boolean val = handleClosing(st,'{');
                    if( val==false){
                        System.out.println( val);
                        return;
            }
        }

    }

    public static  boolean handleClosing( char corresoch ,Stack<Character> st ){

        if( st.size()==0){
            System.out.println(  false);
            return false;
        }else if( st.peek()!= corresoch){
            System.out.println(  false );
        }else {
            st.pop();
            return true;
        }
    }
}
*/