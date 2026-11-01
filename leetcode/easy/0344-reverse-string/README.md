# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 37.31%)  
**Memory:** 48.1 MB (beats 61.87%)  
**Submitted:** 2026-11-01T06:49:29.999Z  

```java
class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp=s[s.length-i-1];
            s[s.length-i-1]=s[i];
            s[i]=temp;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)