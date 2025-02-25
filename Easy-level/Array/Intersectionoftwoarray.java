class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> s1=new HashSet<>();
       Set<Integer> s2=new HashSet<>();
       for(int nums:nums1){
        s1.add(nums);
       }
       for(int nums:nums2){
        if(s1.contains(nums)){
            s2.add(nums);
        }
       }
       int[] result=new int[s2.size()];
       int i=0;
       for(int nums: s2){
        result[i]=nums;
        i++;
       }
       return result;
        
    }
}
/*
complexity:
Time Complexity: O(N + M)
Space Complexity: O(N + M) (due to HashSets and result array)
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
  */
