# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.98%)  
**Memory:** 42.6 MB (beats 46.24%)  
**Submitted:** 2026-08-15T18:10:08.694Z  

```java
class Solution {
    public int reverse(int x) {
        int temp = x;
        int rev=0;
        int negflag=0;
        int digit =0;
        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
            return 0;
        }
        if(temp<0){
            temp=-temp;
            negflag =1;
        }
        while(temp>0){
            digit = temp%10;
            if(rev>(Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            rev = rev*10 + digit;
            temp/=10;
        }
        if(negflag==1){
            return -rev;
        }
        return rev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)