import java.util.Arrays;

public class ZeroToRight {
    public static void main(String[] args) {
       int[] a = {1, 2, 7, 5,0, 0, 37, 8, 0, 0,25,65};
        int i,count=0;
        for(i=0;i<a.length;i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }
        while(count<a.length){
            a[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(a));

    }
}
