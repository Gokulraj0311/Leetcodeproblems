class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;        
    }
}
/*
alternative approach
 class Solution{
 public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int num : nums){
            if(count==0){
                element=num;
                count++;
            }else if(element == num){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
