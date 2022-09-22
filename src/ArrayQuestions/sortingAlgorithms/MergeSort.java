package ArrayQuestions.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] a = {4,7,2,5,1,0,-8};
        System.out.println(Arrays.toString(mergesort(a)));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] a, int[] b){
        int i=0,j=0,k=0;
        int[] merged = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                merged[k] = a[i++];
            else
                merged[k] = b[j++];
            k++;
        }
        while(i<a.length)
            merged[k++] = a[i++];
        while(j<b.length)
            merged[k++] = b[j++];
        return merged;
    }
}
