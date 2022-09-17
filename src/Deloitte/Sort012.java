package Deloitte;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int i;
        int count0 = 0, count1 = 0, count2 = 0;
        int[] a = {1, 0, 2, 1, 2, 0, 1};
        Arrays.sort(a);
        //System.out.println(Arrays.);
        for (i = 0; i < a.length;i++){
            if(a[i]==0)
                count0++;
            else if(a[i]==1)
            count1++;
            else
                count2++;
        }
        i=0;
        while(count0>0) {
            a[i] = 0;
            i++;
            count0--;
        }
        while(count1>0){
            a[i]=1;
            i++;
            count1--;
        }
        while(count2>0){
            a[i]=2;
            i++;
            count2--;
        }
        System.out.println(Arrays.toString(a));
    }
}
