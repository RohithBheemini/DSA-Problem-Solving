# cyclically-rotate-an-array-by-one2614

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T17:31:24.116Z  

```java
class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int k = arr[n-1];
        while(n>1){
            arr[n-1]=arr[n-2];
            n--;
        }
        arr[0]=k;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1)