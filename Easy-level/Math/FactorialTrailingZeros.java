class Solution {
    public int trailingZeroes(int n) {
        if(n>5){
            return 0;
        }
        int sum=0;
        while(n>=5){
            sum+=n/5;
            n=n/5;
        }
        return sum;
    }
} 

/*
Complexity:O(log n)
Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0
  */
