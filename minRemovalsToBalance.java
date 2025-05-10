package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class minRemovalsToBalance {
    public static int removeBracket(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch); //push opening bracket
            } else if(ch == ')'){
                if(st.size() != 0 && st.peek() == '('){
                    st.pop(); //Found a matching pair
                } else {
                    st.push(ch); //unmatched closing bracket
                }
            }
        }
        //Remaining elements in Stack are unmatched
        return st.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String str  = sc.nextLine();

        System.out.println("Bracket remove to make bracket sequence balance : "+removeBracket(str));
    }
}
