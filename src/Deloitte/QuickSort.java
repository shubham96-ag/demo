package Deloitte;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] a={3,4,7,2,14};
        System.out.println(Arrays.toString(Mergesort(a)));

    }

    public static   int[] Mergesort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int [] left=Mergesort(Arrays.copyOfRange(arr,0,mid));
       int [] right= Mergesort(Arrays.copyOfRange(arr,mid,arr.length));
       return(Merge(left,right));
    }
    static int[] Merge(int[] left,int[] right){
        int i=0,j=0,k=0;
        int[] merged=new int[left.length+right.length];
        while(i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                k++;
                i++;
            } else {
                merged[k] = right[j];
                k++;
                j++;
            }
        }
            while(i<left.length )
            {
                merged[k]=left[i];
                i++;
                k++;
            }

            while(j<right.length )
            {
                merged[k]=right[j];
                j++;
                k++;
            }
            return merged;

    }
}
