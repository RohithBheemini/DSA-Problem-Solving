# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 81.44%)  
**Memory:** 45.2 MB (beats 99.76%)  
**Submitted:** 2026-08-16T10:55:23.606Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
            int temp=x;
            int rev=0;
            if(temp==0){
                return true;
            }
            while(temp>0){
                rev=rev*10 + temp%10;
                temp/=10;
            }
            if(rev==x){
                return true;
            }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)