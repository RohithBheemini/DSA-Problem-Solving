# Print GFG n times

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive number  **n**, print the string " **GFG** " exactly n times separated by a single space.

 **Examples:** 

```
Input: n = 5
Output:
GFG GFG GFG GFG GFG
```

```
Input: 3
Output:
GFG GFG GFG
```

 **Constraint:** 
1 ≤ n ≤ 103

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T09:57:32.880Z  

```py
n = int(input())

# Code here
for i in range(0,n):
    print("GFG",end=' ')
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-gfg-n-times/1)