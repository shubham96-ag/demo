package StringKunal;

public class OmittingAAndPrintingStringViaRecursion {
    public static void main(String[] args) {
        String st = "aanfnaf";
        skip("",st);
        System.out.println(skipWithOneArg("ffegeesaa"));
        System.out.println(skipApple("dfdappledfdfapp"));
        //System.out.println("dklfkjjgh".substring(2,4));
    }

    public static void skip(String processed, String unprocessed){
        if(unprocessed.isEmpty())
        {
            System.out.println("processed string is:"+processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch=='a')
            skip(processed,unprocessed.substring(1));
        else
            skip(processed+ch,unprocessed.substring(1));
    }

    public static String skipWithOneArg(String unprocessed){
        if(unprocessed.isEmpty())
        {
            return "";
        }
        char ch = unprocessed.charAt(0);
        if(ch=='a')
            return skipWithOneArg(unprocessed.substring(1));
        else
            return ch+skipWithOneArg(unprocessed.substring(1));
    }
    public static String skipApple(String unprocessed){
        if(unprocessed.isEmpty())
        {
            return "";
        }
        if(unprocessed.startsWith("apple"))
            return skipApple(unprocessed.substring(5));
        else
            return unprocessed.charAt(0)+skipApple(unprocessed.substring(1));
    }

}
