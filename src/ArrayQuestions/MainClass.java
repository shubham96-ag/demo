package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        ArrayQuestions a = new ArrayQuestions();
        int[] arr ={-3,-4,4,-1,-2,1,5,-3};
        int element = 10;
        int index=3;

       // System.out.println(Arrays.toString(arr));
         //a.insertInBegining(arr,element);
        //System.out.println(Arrays.toString(arr));
        //a.insertAtAGivenIndex(arr,element,index);
        //System.out.println(Arrays.toString(arr));
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(2);
        al.add(3);
        al.add(1);
        al.add(4);
       // System.out.println(al);
        //a.rotateLeft(4,al).stream().forEach(n->System.out.print(n+" "));
        System.out.println(Arrays.toString(arr));
        System.out.println(a.largestContigousSumNegative(arr));

        int [] a1={1,6,7,0,7};
        System.out.println("Equilibrium sum point is");
        System.out.println(a.getEquilibriumSumPoint(a1));

        //Leaders in Array | Print Elements which are greater than all it's right elements
        int [] a2 = {20,14,15,14,15,9,5,2,0};
        //System.out.println("Leaders in the array are: ");
        //a.getLeaderElements(a2);

        //check if there exists a pair with given sum using hashset. Complexity O(n)
        System.out.println("checking elements with a given target sum");
        a.ifPairExistsWithHashing(a2,14);

        System.out.println("First repeating value in the array");
        a.firstRepeatingValueInArray(a2);

        System.out.println("Union of two sorted arrays");
        int[] arr1={2,6,-2,6,3,4,2,4,10};
        int[] arr2={-1,-100,-2,-4};
        a.unionOfTwoSortedArrays(arr1,arr2);

        System.out.println("Array - 26: Find Sub-array whose sum is equal to given sum");
        a.subArraySumEqualToGivenSum(arr1,10);

        System.out.println("Array - 27: Find Maximum Sum of sub-array with given size K");
        a.findMaxSumOfSubArrayOfSizeK(arr1,2);

        System.out.println("Array - 29: Find sub-array with maximum sum | Kadane Algo | Largest Subarray Sum");
        a.largestSubarraySum(arr2);









    }
}
