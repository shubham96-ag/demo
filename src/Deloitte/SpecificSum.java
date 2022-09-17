package Deloitte;

import java.util.ArrayList;

public class SpecificSum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int target=9;
        ArrayList<Integer> al=new ArrayList<Integer>();
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]+a[j]==target)
            {
                al.add(i+1);
                al.add(j+1);
                i++;
                j--;
            }
            else if(a[i]+a[j]>target)
                j--;
            else
                i++;
        }
        System.out.println(al);
    }

}
