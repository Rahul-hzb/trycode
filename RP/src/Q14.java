// Stack new memory management.
import java.util.*;
import java.util.Stack;

public class Q14 {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        System.out.println( st  + " -> " + st.peek() + " " + st.size());
        st.push( 20);
        st.push(30);
        st.push(40);
        System.out.println( st  + " -> " + st.peek() + " " + st.size());
        st.pop();
        System.out.println( st  + " -> " + st.peek() + " " + st.size());

    }
}
