# LCM And GCD

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

 **Examples:** 

```
Input: a = 5, b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
```

```
Input: a = 14, b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.

```

```
Input: a = 1, b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
```

 **Constraints:** 
1 ≤ a, b ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T17:04:09.917Z  

```java
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        if(a<b){
            int temp =a;
            a=b;
            b=temp;
        }
        int m=a;
        int n=b;
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm = (m*n)/gcd;
        return new int[]{lcm,gcd};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1)