import java.util.*;
public class insertionInStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // empty the st stack form the new stack to store the vslue

        int idx=0;
        int val =12;
        Stack <Integer> rt = new Stack<>();
        while( st.size()>idx){
            rt.push(st.pop());
        }
        st.push(val);
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);


        //rt.push(6);
        //while (st.size()>0){
          //  rt.push(st.pop());
       // }
        //System.out.println( rt);

        //while( rt.size()>0){
        //    st.push(rt.pop());
        //}
        //System.out.println(st);
    }
}
