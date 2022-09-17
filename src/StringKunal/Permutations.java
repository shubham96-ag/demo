package StringKunal;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println(permutationsWithReturnType("","abc"));
        System.out.println(countPermutations("","abc"));

    }
    public static void permutations(String processed, String unprocessed){
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++){
            String left = processed.substring(0,i);
            String right = processed.substring(i,processed.length());
            permutations(left+ch+right,unprocessed.substring(1));
        }
    }

    public static ArrayList<String> permutationsWithReturnType(String processed, String unprocessed){
        ArrayList<String> ans = new ArrayList<>();
        if(unprocessed.isEmpty())
        {
            ArrayList<String> li=new ArrayList<>();
            li.add(processed);
            return li;
        }
        char ch = unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++){
            String left = processed.substring(0,i);
            String right = processed.substring(i,processed.length());
            ans.addAll(permutationsWithReturnType(left+ch+right,unprocessed.substring(1)));
        }
        return ans;
    }

    public static int countPermutations(String processed, String unprocessed){
        int count = 0;
        if(unprocessed.isEmpty())
        return 1;
        char ch = unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++) {
            String left = processed.substring(0, i);
            String right = processed.substring(i, processed.length());
            count =  count + (countPermutations(left + ch + right, unprocessed.substring(1)));
        }
        return count;
    }
}
