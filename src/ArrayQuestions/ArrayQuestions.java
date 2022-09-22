package ArrayQuestions;

import java.util.*;

public class ArrayQuestions {

    public void insertInBegining(int[] arr, int element) {
        int i;
        for( i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0] = element;
    }

    public void insertAtAGivenIndex(int[] arr, int element, int index) {
        for(int i=arr.length-1;i>index;i--)
            arr[i]=arr[i-1];
        arr[index] = element;
    }

    public List<Integer> rotateLeft(int d, List<Integer> arr) {
        int[] a = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        int[] res=new int[arr.size()];
        int n = arr.size();
        for(int i=0;i<n;i++)
            res[(i-d+n)%n]=a[i];
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i:res)
            l1.add(i);
        return l1;
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<p.size();i++){
            int foundIndex = binarySearch(p, i+1);
            System.out.println(i+1+" "+foundIndex);
            int foundIndex2 = binarySearch(p, foundIndex);
            li.add(foundIndex2);
        }
        return li;
    }
//{5, 2, 3, 1,4}
    public static int binarySearch(List<Integer> p, int key){
        int s = 0;
        int e = p.size()-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(p.get(mid)==key)
                return mid+1;
            if(p.get(mid)<key)
                s=mid+1;
            else
                e=mid-1;
        }
        return -1;
    }

//this  function handles both +ve and -ve values and gives the contigous array sum which is largest
    public int largestContigousSumNegative(int[] arr) {
        int current_max;
        int max_so_far;
        current_max=max_so_far=arr[0];
        for(int i=1;i<arr.length;i++){
            current_max = Math.max(arr[i],arr[i]+current_max);
            max_so_far  = Math.max(current_max,max_so_far);
        }
        return max_so_far;
    }
    //{1,6,7,0,7};
    public int  getEquilibriumSumPoint(int[] a1) {
        int sum = 0;
        int sum_so_far = 0;
        for(int i=0;i<a1.length;i++)
            sum=sum+a1[i];
        for(int i=0; i<a1.length;i++)
        {
            sum = sum - a1[i];
            if(sum==sum_so_far)
                return i;
            sum_so_far = sum_so_far + a1[i];
        }
        return -1;
    }

    //Leaders in Array | Print Elements which are greater than all it's right elements
    //{14,15,8,9,5,2};
    public void getLeaderElements(int[] a2) {
        int max = Integer.MIN_VALUE;
        for(int i=a2.length-1;i>=0;i--){
            if(a2[i]>max){
                max = a2[i];
                System.out.print(max+" ");
            }
        }
    }

    public void ifPairExistsWithHashing(int[] a2, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a2.length;i++)
        {
            if(hs.contains(sum-a2[i]))
                System.out.println(a2[i]+" "+(sum-a2[i]));
            else
                hs.add(a2[i]);
        }
    }

    public void firstRepeatingValueInArray(int[] a2) {
        HashSet<Integer> hs = new HashSet<>();
        int firstRepeat=-1;
        int i;
        for (i = a2.length-1; i >= 0; i--) {
            if (hs.contains(a2[i]))
                firstRepeat = a2[i];
            else
                hs.add(a2[i]);
        }
        System.out.println(firstRepeat);
    }

    public void unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        int[] merged = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j]){
                merged[k]=arr1[i];
                i++;
            }
            else if(arr1[i]==arr2[j]){
                merged[k]=arr1[i];
                i++;
                j++;
            }
            else{
                merged[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            merged[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            merged[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(merged));
    }


    public void subArraySumEqualToGivenSum(int[] a, int sum) {
        HashMap<Integer,Integer> hm= new HashMap<>();  //key is sumTillNow    value is index   eg. hm[2] will mean a[0]+a[1]+a[2]
        if(a.length==0)
            System.out.println("Array is empty");
        int end=0;
        int sumTillNow=0;
        int windowSum=0;
        while(end<a.length){
            sumTillNow=sumTillNow+a[end];
            if(sum==sumTillNow)
            {
                System.out.println("Sum occured from index "+0+" "+end);
                return;
            }
            windowSum = sumTillNow-sum;
            if(hm.containsKey(windowSum)){
                int start = hm.get(windowSum);
                System.out.println("Sum occured from index " +(start+1)+" "+end);
            }
                hm.put(sumTillNow,end++);
        }
    }

    //Array - 27: Find Maximum Sum of sub-array with given size K
    public void findMaxSumOfSubArrayOfSizeK(int[] a, int k) {
        int i,sum=0,maxSum=0,n=a.length;
        for(i=0;i<k;i++)
            sum=sum+a[i];
        for(i=1;i<=n-k;i++)
        {
            sum = sum-a[i-1]+a[i+k-1];
            if(sum>maxSum)
                maxSum=sum;
        }
        System.out.println("Maximum sum of array of size "+k+" is "+maxSum);
    }

    //Array - 29: Find sub-array with maximum sum | Kadane Algo | Largest Subarray Sum
    public void largestSubarraySum(int[] arr) {
        if(arr.length==0)
        {
            System.out.println("Array is empty");
            return;
        }
        int max_sum=Integer.MIN_VALUE;
        int max_element=Integer.MIN_VALUE;
        int sum=0,i,n;
        n= arr.length;
        boolean hasPositive=false;
        for(i=0;i<n;i++){
            if(arr[i]>0)
                hasPositive=true;
            max_element=Math.max(arr[i],max_element);

            sum=sum+arr[i];
            if(sum<0){
                sum=0;
                continue;
            }
            max_sum=Math.max(sum,max_sum);
        }
         int res = hasPositive?max_sum:max_element;
        System.out.println("Max subarray sum: "+res);
    }
}
