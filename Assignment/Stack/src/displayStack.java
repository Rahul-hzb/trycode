import java.util.*;
public class displayStack {
    public static void main(String[] args) {

        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st);// this is inbuild function if we
        // not use this function then how to displa
        // 2 method.
         // 1.
       // Stack <Integer> rt = new Stack<>();
        //while (st.size()>0){
         //   rt.push(st.pop());

        //}
        //while(rt.size()>0){
          //  int x = rt.pop();
            //System.out.print(x + " ");
            //st.push(x);
        //}
      // 2.
        int n = 5;
        int arr[]= new int[n];
        for( int i =0 ; i<n-1;i--){ // in reverse
            arr[i]=st.pop(); // st.element ko pop kr ke arr[i] me rakh do
        }
       // array ko empty kr ke stack st me rakhana hai
        for( int i=0; i<n ;i++){
            System.out.print( arr[i]);
            st.push(arr[i]);
        }


    }

}
