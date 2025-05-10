package Stacks;

import java.util.Stack;
import java.util.Scanner;
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

//--------------------reverse order-------------------------------------------
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            //This line gives the same input as above three line gives
            rt.push(st.pop());
        }
        System.out.println(rt);

//------------------copy the given stack------------------------------------
        Stack<Integer> gt = new Stack<>();
        while(rt.size() > 0){
//            int x = rt.peek();
//            gt.push(x);
//            rt.pop();
            //This line gives the same input as above three line gives
            gt.push(rt.pop());
        }
        System.out.println(gt);

//------------------taking Stack element using user input-----------------------------------
//        System.out.println("Enter the number of element : ");
//        int n = sc.nextInt();
//        System.out.println("Enter the element : ");
//        for(int i = 1; i <= n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);

    }
}
