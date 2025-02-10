class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            }
            i++;
        }
    }
}
/*
Time complexity==>o(n)
-------------Alternative------------
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
