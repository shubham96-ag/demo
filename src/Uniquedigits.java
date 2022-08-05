import java.util.ArrayList;

public class Uniquedigits {
    public static void main(String[] args) {
        int [] a={0,0,0,0,0,0,0,0,0,0};
        int i;
        int n=-123001;
        n=Math.abs(n);
        while(n>0)
        {
            int dig=n%10;
            a[dig]+=1;
            n=n/10;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(i=0;i<a.length;i++){
            if(a[i]>0){
                al.add(i);
            }
        }
        System.out.println(al.size());
    }
}
