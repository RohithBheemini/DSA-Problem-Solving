# Delete Alternate Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  as input. Delete the characters at odd indices of the string and return the modified string.

 **Examples :** 

```
Input: s = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1 and "k" at index 3.

```

```
Input: s = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e, k at index 1, 3, 5, 7, 9, 11.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T13:51:59.659Z  

```java
class Solution {
    static String delAlternate(String s) {
        // code here
        String sd="";
        for(int i=0;i<s.length();i+=2){
            sd+=s.charAt(i);
        }
        return sd;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1)