package LeetCode260SingleNumberIII;

import java.util.Arrays;

class LeetCode260SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int b1=0,b2=0;
        boolean f=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]&&!f){
                b1=nums[i];
                f=true;
                continue;
            }
            if(nums[i]!=nums[i+1]&&f){
                b2=nums[i];
                return new int[]{b1,b2};
            }
            i++;
        }
        b2=nums[nums.length-1];
        return new int[]{b1,b2};
    }
}

/**
 Code Submitted By Kamal Murmu
 */