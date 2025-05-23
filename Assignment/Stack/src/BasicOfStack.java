import java.util.*;
public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(" size is : " + st.size());
        System.out.println(st);
        System.out.println( " is empty " + st.isEmpty());

        st.push(1);
        System.out.println(" size is : " + st.size());
        System.out.println(st);

        st.push(23);
        System.out.println(" size is : " + st.size());
        System.out.println(st);

        st.push(90);
        System.out.println(" size is : " + st.size());
        System.out.println(st);

        st.push(5);
        System.out.println(" size is : " + st.size());
        System.out.println(st);

        st.push(34);
        System.out.println(" size is : " + st.size());
        System.out.println(st);

        //peek
        // System.out.println(st.peek());
         //System.out.println(st);
      /*   st.pop();
         System.out.println(st.peek());
         st.pop();
         System.out.println(st.size());*/

        // print the last element
       // while (st.size()>1){
        //    st.pop();
       // }
       // System.out.println( st.peek());
       // System.out.println( st);// problem is arises

    }
}
