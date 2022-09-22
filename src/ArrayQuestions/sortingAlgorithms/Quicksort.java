package ArrayQuestions.sortingAlgorithms;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] a ={3,5,4,10,1,3,2,4,2,2};
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    public static void quicksort(int[] a,int low,int high){
        if(low>=high)  //low and high are indicative of the subarray to be sorted
            return;
        int s = low;
        int e = high;
        int mid = s + (e-s)/2; //(s+e)/2
        int pivot = a[mid];
        while(s<=e){
            while(a[s]<pivot)//All elemets to left of pivot are smaller than pivot. the moment we find violation we get pout of the loop and
                s++;
            while(a[e]>pivot)
                e--;
            if(s<=e)//check again as it might get violated in while loop
            {//swap the two violating indexes
                int temp;
                temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        quicksort(a,low,e);
        quicksort(a,s,high);
    }
}
