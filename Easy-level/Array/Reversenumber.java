
class Solution {
    public int reverse(int x) {
       int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        // Reverse the digits
        int reversedNum = 0;
        while (x > 0) {
            int digit = x % 10;

            // Check for overflow before updating reversedNum
            if (reversedNum > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // Overflow will occur
            }

            reversedNum = reversedNum * 10 + digit;
            x = x / 10;
        }

    
        reversedNum *= sign;

        return reversedNum;
    }
}



/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
Constraints:
-231 <= x <= 231 - 1
*/
