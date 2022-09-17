import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] a={6,5,4,2,0};
        System.out.println(Arrays.toString(mergesort(a)));
        System.out.println(Arrays.toString(a));

    }
    static int[] mergesort(int[] arr){
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;

        int [] left= mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while ( j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
