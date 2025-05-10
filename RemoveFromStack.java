package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveFromStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int n = st.size();
        System.out.println("Enter index : ");
        int idx = sc.nextInt();
//        System.out.println("Enter element : ");
//        int x = sc.nextInt();
        if( n < 0 || idx >= n){
            System.out.println("Invalid index");
        }
        else{
            Stack<Integer> rt = new Stack<>();
            while(st.size() > idx){
                rt.push(st.pop());
            }
            st.pop();
            while(rt.size() >= 0){
                st.push(rt.pop());
            }
        }
        System.out.println(st);
    }
}
