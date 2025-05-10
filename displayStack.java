package Stacks;

import java.util.Stack;

public class displayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

//---------------Display Stack element in reverse order using recursion------
        displayReverseRec(st);
        System.out.println();

//---------------Display Stack element using recursion ----------------------
        displayRec(st);


////---------------Display the same element using Stack-------------------------
//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());
//        }
//        while(rt.size() > 0){
//            int x = rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

////---------------Display the Stack element using Array--------------------
//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i = n-1; i >=0; i--){
//           /* int x = st.pop();
//            arr[i] = x;  */
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i < n; i++) {
//            /*int x = arr[i];
//            st.push(x) */
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
    }
}
