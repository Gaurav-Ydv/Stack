package Stacks;

//import java.util.*;
//import java.util.ArrayList;
import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        //ArrayList<Integer> arr = new ArrayList<>();
//------creation of new Stack--------------------------------------------------------------
        Stack<Integer> st = new Stack<>();


////------Before pushing the element size of stack is ZERO and stack is EMPTY--------------
//        System.out.println("Size is : "+st.size());
//        System.out.println(st);
        System.out.println(st.isEmpty());

        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        System.out.println(st.isEmpty());

        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is : "+st.size());

//------find the first element of the stack-------------------------------
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
