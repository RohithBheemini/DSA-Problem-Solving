# Concatenate Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers **a**  and  **b**, you need to concatenate them so the output is ab and print it.

 **Examples:** 

```
Input: a = 5, b = 6
Output: 56
Explanation: Concatenate them.
```

```
Input: a = 1, b = 9
Output: 19
Explanation: Concatenate them.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T06:35:51.770Z  

```java
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int c;
        if(a<10) c=a*10+b;
        else if(a>=10 && a<100) c=a*100+b;
        else c=a*1000+b;
        System.out.print(c);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/concatenate-integers/1)