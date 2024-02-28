package LeetCode136SingleNumber;

import java.util.Arrays;

class LeetCode136SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

/**
 Code Submitted By Kamal Murmu
 */