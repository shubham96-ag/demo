package StringKunal;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subsequence("","abc");
        System.out.println(subsequenceWithArrayList("","abc",new ArrayList<>()));
        System.out.println(subsequenceWithArrayList2("","abc"));

    }
    public static void subsequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        subsequence(processed+unprocessed.charAt(0),unprocessed.substring(1));
        subsequence(processed,unprocessed.substring(1));
    }

    //This is method 1 in which the function op is passed as a parameter to function
    public static ArrayList<String> subsequenceWithArrayList(String processed, String unprocessed,ArrayList<String> li){
        if(unprocessed.isEmpty()) {
            li.add(processed);
            return li;
        }
        subsequenceWithArrayList(processed+unprocessed.charAt(0),unprocessed.substring(1),li);
        subsequenceWithArrayList(processed,unprocessed.substring(1),li);
        return li;
    }

    //This is method 2 in which arraylist to be returned is declared inside the function
    public static ArrayList<String> subsequenceWithArrayList2(String processed, String unprocessed){
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return  list;
        }
        ArrayList<String> left = subsequenceWithArrayList2(processed+unprocessed.charAt(0),unprocessed.substring(1));
        ArrayList<String> right = subsequenceWithArrayList2(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
