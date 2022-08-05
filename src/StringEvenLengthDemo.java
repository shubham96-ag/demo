import java.util.Arrays;

public class StringEvenLengthDemo {
    public static void main(String[] args) {
        String st="Be not afraid of greatness, some are born great,some schieve greatness, and some have greatness thrust upon  them.";
        String[] a=st.split("[,\s]+");
        int max=0;
        String longest="";
        System.out.println(Arrays.toString(a));
        for(String i: a){
            if(i.length()>max){
                max=i.length();
                longest=i;
            }
        }
        System.out.println(longest);

    }
}
