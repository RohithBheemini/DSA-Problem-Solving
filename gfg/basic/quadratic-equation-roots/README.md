# Quadratic Equation Roots

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a quadratic equation  **ax2 + bx + c = 0**, find its roots. If the equation has real roots, then return floor value of each root in decreasing order, If the roots are imaginary return  **-1**, the driver code will print  **Imaginary**.

 **Examples:** 

```
Input: a = 1, b = -2, c = 1
Output: [1, 1]
Explanation: Roots of equation x2-2x+1 are 1 and 1.
```

```
Input: a = 1, b = -7, c = 12
Output: [4, 3]
Explanation: Roots of equation x2 - 7x + 12 are 4 and 3.
```

 **Constraints:** 
-103 ≤ a, b, c ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T16:34:15.690Z  

```java
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        int exp=b*b-4*a*c;
        if(exp<0) return new ArrayList<>(List.of(-1));
        int m =-b/(2*a);
        if(exp==0) return new ArrayList<>(List.of(m,m));
        double sqrt = Math.sqrt(exp);
        int x=(int)Math.floor((-b+sqrt)/(2.0*a));
        int y=(int)Math.floor((-b-sqrt)/(2.0*a));
        return new ArrayList<>(List.of(x,y));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quadratic-equation-roots/1)