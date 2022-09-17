package Deloitte;

import java.util.Arrays;

public class Segregate1and0 {
    public static void main(String[] args) {
        int [] a={1,0,1,1,0};
        //put all 0 to left
        int i;
        int  count=0;
        for(i=0;i<a.length;i++){
            if(a[i]==0) {
                a[count] = 0;
                count++;
            }
        }
        while(count!=a.length){
            a[count]=1;
            count++;
        }
        System.out.println(Arrays.toString(a));

    }
}
