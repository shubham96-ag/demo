import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        ArrayList<Integer> EvenNumber=new ArrayList<Integer>();
        a.add(1);
        a.add(20);
        a.add(30);
        a.add(40);
        //filter will take predicate
        EvenNumber= (ArrayList<Integer>) a.stream().filter(n -> n%2==0).collect(Collectors.toList());
        //for each will take consumer
        a.stream().filter(n -> n%2==0).forEach(i->System.out.println(i));



    }
}
