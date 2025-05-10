package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println(str);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String s = ""+ch;
                val.push(s);
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
//-------------------Method(1)
//                if(ch =='+') val.push(v1 + ch + v2);
//                if(ch =='-') val.push(v1 + ch + v2);
//                if(ch =='*') val.push(v1 + ch + v2);
//                if(ch =='/') val.push(v1 + ch + v2);
//-------------------Method(2)shortest code of the above code------------------
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
