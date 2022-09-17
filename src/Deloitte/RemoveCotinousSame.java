package Deloitte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveCotinousSame {
    public static void main(String[] args) {
        int i;
        String[] a={"Tom","jerry","jerry","Tom","Tom","Tom"};
        Stack<String> st=new Stack<String>();
        st.push(a[0]);
        for(i=1;i<a.length;i++) {
            if (!st.isEmpty() && st.peek() == a[i])
                st.pop();
            else
                st.push(a[i]);
        }
        System.out.println(st);
    }
}

