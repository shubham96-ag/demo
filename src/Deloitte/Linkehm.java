package Deloitte;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Linkehm {
    public static void main(String[] args) {
        String st="hellossjju is a good";
        LinkedHashMap <Character,Integer> hm=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<st.length();i++){
            if(hm.containsKey(st.charAt(i))){
                hm.put(st.charAt(i),hm.get(st.charAt(i))+1);
            }
            else{
                hm.put(st.charAt(i),1);
            }
        }
        ArrayList<Character> al=new ArrayList<Character>();
        for(Map.Entry e : hm.entrySet()) {
            if((int)e.getValue()>1)
              al.add((char) e.getKey());
        }
          System.out.println(al);
        }
    }

