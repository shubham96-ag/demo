package Deloitte;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,complement;
        int n=nums.length;
        int [] result={0,0};
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(i=0;i<n;i++){
            //hm.put(nums[i],i);
            complement=target-nums[i];
            if(hm.containsKey(complement) ){
                result[0]=i;
                result[1]=hm.get(complement);
                break;
            }
        }
        return result;

    }
}