package Deloitte;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] a={0,1,2,3,4,5,6,7,8};
        int i=0,j=0,temp;
        j=a.length-1;
        while(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));

    }
}
