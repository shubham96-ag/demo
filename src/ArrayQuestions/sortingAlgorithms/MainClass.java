package ArrayQuestions.sortingAlgorithms;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        MainClass a = new MainClass();
        int[] arr ={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        //a.bubbleSort(arr);
        // a.selectionSort(arr);
        a.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static boolean swapped;
    public void bubbleSort(int[] a) {
        int n=a.length;
        int temp;
        swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    swapped=true;
                }
            }
            //checking if in a ith pass no swapping took place this means that the array is sorted
            if(swapped==false)
                break;
        }
    }

    private void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n; i++){
            int lastIndex = n-i-1;
            int maxElementIndex = findMaxElementIndex(arr,0,lastIndex);
            swap(arr,maxElementIndex,lastIndex);
        }
    }

    private void insertionSort(int[] arr) {
        int n =arr.length;
        for(int i=0;i<n-1;i++){ //for i=0 means that element a[0] and a[1] should be sorted ie. sorted till i+1. Hence not
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break; //this means that the element at the correct position wrt the sorted array in the left. Hence need not to check again
            }
        }
    }



    public void swap(int[] arr, int maxElementIndex,int lastElementIndex){
        int temp;
        temp=arr[maxElementIndex];
        arr[maxElementIndex]=arr[lastElementIndex];
        arr[lastElementIndex]=temp;
    }

    private int findMaxElementIndex(int[] arr, int startIndex, int lastIndex) {
        int maxIndex = startIndex;
        for(int i = startIndex;i<=lastIndex;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex=i;
        }
        return maxIndex;
    }
}
