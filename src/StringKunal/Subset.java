package StringKunal;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(subset(a));
        System.out.println("ndvdbv".substring(0,1));
    }

    //both time and space complexity is N*2^N
    public static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        Set myset = new HashSet();
        myset.addAll(outer);
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        al.addAll(myset);
        return al;
    }
}
