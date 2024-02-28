package LeetCode137SingleNumberII;

import java.util.Arrays;

class LeetCode137SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i]!=nums[i+1]&&nums[i]!=nums[i+2]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
/**
 Code Submitted By Kamal Murmu
 */