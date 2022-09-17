package Deloitte;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String st = "[()]{}(})";
        System.out.println(isValid(st));
    }


    public  static  boolean isValid(String s){
        Stack<Character> st=new Stack<Character>();
        if(s.length()%2!=0)
            return false;

        for(Character ch:s.toCharArray()){
            if(ch=='(' || ch=='['||ch=='{')
                st.push(ch);
            else if(ch==')' && !st.isEmpty() && st.peek()=='(')
                st.pop();
            else if(ch==']' && !st.isEmpty() && st.peek()=='[')
                st.pop();
            else if(ch=='}' && !st.isEmpty() && st.peek()=='{')
                st.pop();
        }
        return st.isEmpty();

    }

}
