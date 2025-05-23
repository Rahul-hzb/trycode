import java.util.*;
public class copyStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
       // System.out.println( " Entre the no.of element in a stack ");
        //int n = sc.nextInt();
        //System.out.println( " Entre the element ");
        //for( int i =0;i<n; i++){
          //  int value =sc.nextInt();
            //st.push(value);
        //}
       // System.out.println( st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // reverse order
        Stack <Integer> rt = new Stack<>();
        while (st.size()>0){
            int val =st.peek();
            rt.push(val);
            st.pop();
        }
        System.out.println(rt);

        // copy of st
        Stack <Integer> cp= new Stack<>();
        while (rt.size()>0){
            int x=rt.peek();
            cp.push(x);
            rt.pop();
        }
        System.out.println(st);// st.stack is empty
        while (cp.size()>0){
            st.push(cp.pop());
        }
        System.out.println(st);
    }
}